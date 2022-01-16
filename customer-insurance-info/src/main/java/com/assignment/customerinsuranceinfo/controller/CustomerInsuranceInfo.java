package com.assignment.customerinsuranceinfo.controller;

import java.util.Arrays;
import java.util.List;

import com.assignment.customerinsuranceinfo.model.CustomerInsurance;
import com.assignment.customerinsuranceinfo.model.InsuranceInfo;
import com.assignment.customerinsuranceinfo.model.InsuranceItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/customer")
public class CustomerInsuranceInfo {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/insurance")
    public CustomerInsurance getCustomerInsurance(@RequestParam("custId") long custId) {
        /*
         * return new CustomerInsurance(1, "Adolf Dsilva", "01068339", List.of(
         * new
         * InsuranceInfo(22771282L,"Term Insurance","Term Insurance is life insurance"
         * ,50, 500.00, "20230120"),new InsuranceInfo(22771282L,"Covid Insurance"
         * ,"Covid Insurance is for covid coverage", 50, 500.00, "20230120")));
         */
        CustomerInsurance customerInsurance = restTemplate.getForObject(
                "http://customer-info-service/customer/profile?custId=" + custId,
                CustomerInsurance.class);

        ResponseEntity<InsuranceInfo[]> insuranceResponse = restTemplate
                .getForEntity("http://customer-info-service/customer/insurance?custId=" + custId,
                        InsuranceInfo[].class);
        List<InsuranceInfo> custInsurances = Arrays.asList(insuranceResponse.getBody());

        custInsurances.forEach(insurance -> {
            final InsuranceItem tempItem = restTemplate.getForObject(
                    "http://insurance-inventory-service/insurance/filter?policyNumber=" + insurance.getPolicyNumber(),
                    InsuranceItem.class);
            insurance.setInsuranceName(tempItem.getName());
            insurance.setInsuranceDesc(tempItem.getDesc());
        });

        customerInsurance.setInsurances(custInsurances);
        return customerInsurance;
    }

}
