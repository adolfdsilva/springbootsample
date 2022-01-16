package com.assignment.customerinsuranceinfo.controller;


import java.util.Collections;

import com.assignment.customerinsuranceinfo.model.CustomerInsurance;
import com.assignment.customerinsuranceinfo.model.Insurance;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custinsurance")
public class CustomerInsuranceInfo {

    @RequestMapping("/{custId}")
    public CustomerInsurance getCustomerInsurance(@PathVariable("custId") String custId) {
        return new CustomerInsurance(1, "Adolf Dsilva", "01068339", Collections.singletonList(new Insurance(22771282L, "Term Insurance", "Term Insurance is life insurance")));
    }
    
}
