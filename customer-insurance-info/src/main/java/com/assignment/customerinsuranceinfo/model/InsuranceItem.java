package com.assignment.customerinsuranceinfo.model;

public class InsuranceItem {
    private long policyNumber;
    private String insuranceName;
    private String insuranceDesc;

    public InsuranceItem() {}
    public InsuranceItem(long policyNumber,String name, String desc) {
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