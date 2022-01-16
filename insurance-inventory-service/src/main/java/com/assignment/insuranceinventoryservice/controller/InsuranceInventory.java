package com.assignment.insuranceinventoryservice.controller;

import java.util.List;

import com.assignment.insuranceinventoryservice.model.InsuranceItem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insurance")
public class InsuranceInventory {

    final List<InsuranceItem> insurances = List.of(
            new InsuranceItem(22771282L, "Term Insurance", "Term Insurance is life insurance"),
            new InsuranceItem(22771283L, "Health Insurance", "Health Insurance is for medical expenses"),
            new InsuranceItem(22771284L, "Covid Insurance", "Covid Insurance is for covid coverage"));

    @RequestMapping("/all")
    public List<InsuranceItem> getInsuranceList() {
        return insurances;
    }

    @RequestMapping("/filter")
    public InsuranceItem getInsuranceById(@RequestParam("policyNumber") long policyNumber) {
        return insurances.stream().filter((insurance) -> policyNumber == insurance.getPolicyNumber()).findFirst()
                .orElse(null);

    }
}