package com.assignment.customerinfoservice.controller;

import java.util.List;
import java.util.Map;

import com.assignment.customerinfoservice.model.Customer;
import com.assignment.customerinfoservice.model.Insurance;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerInfo {

    final Map<Long, List<Insurance>> userInsurances = Map.of(114533332L,
            List.of(
                    new Insurance(22771282L, 50, 500.00, "20230120"),
                    new Insurance(22771284L, 2, 50.00, "20220209")),
            114533334L, List.of(
                    new Insurance(22771283L, 40, 1000.00, "20230501")));

    final Map<Long, Customer> customers = Map.of(114533332L,
            new Customer(114533332L, "Adolf Dsilva", "01068339"),
            114533334L, new Customer(114533334L, "Orphin Dias", "096608111"));

    @RequestMapping("/profile")
    public Customer getCustomerInfo(@RequestParam("custId") long custId) {
        return customers.get(custId);
    }

    @RequestMapping("/insurance")
    public List<Insurance> getCustomerInsurances(@RequestParam("custId") long custId) {
        return userInsurances.get(custId);
    }
}