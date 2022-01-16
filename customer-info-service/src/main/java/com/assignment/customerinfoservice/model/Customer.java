package com.assignment.customerinfoservice.model;

public class Customer {
    
    private long custId;
    private String custName;
    private String custMobile;

    public Customer(long custId, String custName, String custMobile) {
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
}
