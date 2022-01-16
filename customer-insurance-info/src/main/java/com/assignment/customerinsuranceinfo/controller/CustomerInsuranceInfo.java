package com.assignment.customerinsuranceinfo.controller;

import java.util.Collections;

import com.assignment.customerinsuranceinfo.model.CustomerInsurance;
import com.assignment.customerinsuranceinfo.model.Insurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/custinsurance")
public class CustomerInsuranceInfo {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{custId}")
    public CustomerInsurance getCustomerInsurance(@PathVariable("custId") long custId) {

        // TODO: get insurance info

        // TODO: get customer info

        // TODO: combine the info and send
        return new CustomerInsurance(1, "Adolf Dsilva", "01068339", Collections.singletonList(new Insurance(22771282L,
                "Term Insurance", "Term Insurance is life insurance", 10, 500.00, "20230120")));
    }

}
