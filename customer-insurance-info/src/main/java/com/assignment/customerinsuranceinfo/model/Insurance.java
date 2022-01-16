package com.assignment.customerinsuranceinfo.model;

public class Insurance {
    private long policyNumber;
    private String insuranceName;
    private String insuranceDesc;
    private int term;
    private double premium;
    private String nextPaymentDate;

    public Insurance() {
    }

    public Insurance(long policyNumber, String name, String desc, int term, double premium, String nextPaymentDate) {
        this.policyNumber = policyNumber;
        this.insuranceName = name;
        this.insuranceDesc = desc;
        this.term = term;
        this.premium = premium;
        this.nextPaymentDate = nextPaymentDate;
    }

    public long getPolicyNumber() {
        return this.policyNumber;
    }

    public void setPolicyNumber(long policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getName() {
        return this.insuranceName;
    }

    public void setName(String name) {
        this.insuranceName = name;
    }

    public String getDesc() {
        return this.insuranceDesc;
    }

    public void setDesc(String desc) {
        this.insuranceDesc = desc;
    }

    public int getTerm() {
        return this.term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double getPremium() {
        return this.premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public String getNextPaymentDate() {
        return this.nextPaymentDate;
    }

    public void setNextPaymentDate(String nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }

}
