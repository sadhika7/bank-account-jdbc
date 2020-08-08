package com.vastika.bank_account_jdbc.model;

public class BankAccountBalance {
	
	private double deposit_amount;
	private double withdraw_amount;
	private double balance;
	private int account_info_id;


	public int getAccountInfoId() {
		return account_info_id;
	}
	
	public void setAccountInfoId(int account_info_id) {
		this.account_info_id = account_info_id;
	}
	
	public double getDepositAmount() {
		return deposit_amount;
	}
	
	public void setDepositAmount(double deposit_amount) {
		this.deposit_amount=deposit_amount;
	}
	
	public double getWithdrawAmount() {
		return withdraw_amount;
	}
	
	public void setWithdrawAmount(double withdraw_amount) {
		this.withdraw_amount = withdraw_amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}