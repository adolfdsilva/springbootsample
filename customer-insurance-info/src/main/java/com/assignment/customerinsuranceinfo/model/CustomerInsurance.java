package com.assignment.customerinsuranceinfo.model;

import java.util.List;

public class CustomerInsurance {
    private long custId;
    private String custName;
    private String custMobile;
    private List<InsuranceInfo> insurances;

    public CustomerInsurance(){}

    public CustomerInsurance(long custId, String custName, String custMobile) {
        this.custId = custId;
        this.custName = custName;
        this.custMobile = custMobile;
    }

    public long getCustId() {
        return this.custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return this.custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustMobile() {
        return this.custMobile;
    }

    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }

    public List<InsuranceInfo> getInsurances() {
        return this.insurances;
    }

    public void setInsurances(List<InsuranceInfo> insurances) {
        this.insurances = insurances;
    }    

}
