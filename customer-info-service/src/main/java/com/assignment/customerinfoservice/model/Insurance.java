package com.assignment.customerinfoservice.model;

public class Insurance {
    private long policyNumber;
    private int term;
    private double premium;
    private String nextPaymentDate;

    public Insurance() {
    }

    public Insurance(long policyNumber, int term, double premium, String nextPaymentDate) {
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

}
