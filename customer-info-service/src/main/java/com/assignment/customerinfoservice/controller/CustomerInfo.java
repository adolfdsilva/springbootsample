package com.assignment.customerinfoservice.controller;

import com.assignment.customerinfoservice.model.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerInfo {

    @RequestMapping("/{custId}")
    public Customer getCustomer(@PathVariable("custId") String custId) {
        return new Customer(1, "Adolf Dsilva", "01068339");
    }
}