package com.assignment.customerinsuranceinfo.controller;

import java.util.Arrays;
import java.util.List;

import com.assignment.customerinsuranceinfo.model.CustomerInsurance;
import com.assignment.customerinsuranceinfo.model.InsuranceInfo;
import com.assignment.customerinsuranceinfo.model.InsuranceItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

        CustomerInsurance customerInsurance = restTemplate.getForObject(
                "http://localhost:8083/customer/profile?custId=" + custId,
                CustomerInsurance.class);

        ResponseEntity<InsuranceInfo[]> insuranceResponse = restTemplate
                .getForEntity("http://localhost:8083/customer/insurance?custId=" + custId, InsuranceInfo[].class);
        List<InsuranceInfo> custInsurances = Arrays.asList(insuranceResponse.getBody());

        custInsurances.forEach(insurance -> {
            final InsuranceItem tempItem = restTemplate.getForObject(
                    "http://localhost:8082/insurance/filter?policyNumber=" + insurance.getPolicyNumber(),
                    InsuranceItem.class);
            insurance.setInsuranceName(tempItem.getName());
            insurance.setInsuranceDesc(tempItem.getDesc());
        });

        customerInsurance.setInsurances(custInsurances);
        return customerInsurance;
    }

}
