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
	/**
	 * @param id
	 * @param account_name
	 * @param address
	 * @param mobileNo
	 * @param unique_id_type
	 */
	public BankAccountInfo(int id, String account_name, String address, long mobileNo, String unique_id_type) {
		this.id = id;
		this.account_name = account_name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.unique_id_type = unique_id_type;
	}
	/**
	 * 
	 */
	public BankAccountInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param account_name
	 * @param address
	 * @param mobileNo
	 * @param unique_id_type
	 */
	public BankAccountInfo(String account_name, String address, long mobileNo, String unique_id_type) {
		this.account_name = account_name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.unique_id_type = unique_id_type;
	}

}
