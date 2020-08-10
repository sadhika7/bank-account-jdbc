package com.vastika.bank_account_jdbc.service;

import com.vastika.bank_account_jdbc.model.BankAccountBalance;
import com.vastika.bank_account_jdbc.model.BankAccountInfo;

public interface BankAccountService {
	
	int creatNewAccount (BankAccountInfo accountInfo);
	int saveAccountInfo(BankAccountInfo accountInfo);
	int updateAccountInfo(BankAccountInfo accountInfo);
	void DeleteAccountInfo(String unique_id_type);
	
	int SaveAccountBalance(BankAccountBalance accountBalance);
	int UpdateAccountBalance(BankAccountBalance accountBalance);

}
