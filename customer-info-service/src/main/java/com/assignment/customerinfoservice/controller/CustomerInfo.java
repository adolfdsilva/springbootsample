package com.assignment.customerinfoservice.controller;

import java.util.List;

import com.assignment.customerinfoservice.model.Customer;
import com.assignment.customerinfoservice.model.Insurance;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerInfo {

    @RequestMapping("/profile")
    public Customer getCustomerInfo(@RequestParam("custId") String custId) {
        return new Customer(1, "Adolf Dsilva", "01068339");
    }

    @RequestMapping("/insurance")
    public List<Insurance> getCustomerInsurances(@RequestParam("custId") String custId) {
        return List.of(
                new Insurance(22771282L, 50, 500.00, "20230120"),
                new Insurance(22771284L, 2, 50.00, "20220209"));
    }
}