package com.assignment.customerinsuranceinfo.model;

public class InsuranceInfo {
    private long policyNumber;
    private int term;
    private double premium;
    private String nextPaymentDate;
    private String insuranceName;
    private String insuranceDesc;

    public InsuranceInfo() {
    }

    public InsuranceInfo(long policyNumber, int term, double premium, String nextPaymentDate) {
        this.policyNumber = policyNumber;
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

    public String getInsuranceName() {
        return this.insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getInsuranceDesc() {
        return this.insuranceDesc;
    }

    public void setInsuranceDesc(String insuranceDesc) {
        this.insuranceDesc = insuranceDesc;
    }
}
