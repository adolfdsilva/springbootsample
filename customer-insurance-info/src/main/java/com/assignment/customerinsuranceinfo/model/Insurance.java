package com.assignment.customerinsuranceinfo.model;

public class Insurance {
    private long policyNumber;
    private String insuranceName;
    private String insuranceDesc;

    public Insurance(){}

    public Insurance(long policyNumber,String name, String desc) {
		this.policyNumber = policyNumber;
        this.insuranceName = name;
        this.insuranceDesc = desc;
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
}
