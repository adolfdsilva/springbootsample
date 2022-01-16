package com.assignment.insuranceinventoryservice.controller;

import java.util.Collections;
import java.util.List;

import com.assignment.insuranceinventoryservice.model.InsuranceItem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class InsuranceInventory {

    @RequestMapping("insurances")
    public List<InsuranceItem> getInsuranceList() {
        return List.of(
            new InsuranceItem(22771282L, "Term Insurance", "Term Insurance is life insurance"),
            new InsuranceItem(22771283L, "Health Insurance", "Health Insurance is for medical expenses"),
            new InsuranceItem(22771284L, "Covid Insurance", "Covid Insurance is for covid coverage")
        );
    }
}