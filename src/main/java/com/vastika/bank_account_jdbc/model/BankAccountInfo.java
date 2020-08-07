package com.vastika.bank_account_jdbc.model;

public class BankAccountInfo {
	
	private int id;
	private String account_name;
	private String address;
	private long mobileNo;
	private String unique_id_type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountname() {
		return account_name;
	}
	public void setAccountname(String account_name) {
		this.account_name = account_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getUniqueIdType() {
		return unique_id_type;
	}
	
	public void setUniqueIdType(String unique_id_type) {
		this.unique_id_type = unique_id_type;
	}

}
