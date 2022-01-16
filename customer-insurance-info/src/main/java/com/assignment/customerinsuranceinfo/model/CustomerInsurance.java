package com.assignment.customerinsuranceinfo.model;

import java.util.List;

public class CustomerInsurance {
    private long custId;
    private String custName;
    private String custMobile;
    private List<Insurance> insurances;

    public CustomerInsurance(){}

    public CustomerInsurance(long custId, String custName, String custMobile, List<Insurance> insurances ) {
        this.custId = custId;
        this.custName = custName;
        this.custMobile = custMobile;
        this.insurances = insurances;
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

    public List<Insurance> getInsurances() {
        return this.insurances;
    }

    public void setInsurances(List<Insurance> insurances) {
        this.insurances = insurances;
    }    

}
