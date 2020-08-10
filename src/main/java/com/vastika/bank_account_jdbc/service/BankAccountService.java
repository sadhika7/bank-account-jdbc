package com.vastika.bank_account_jdbc.service;

import com.vastika.bank_account_jdbc.model.BankAccountInfo;

public interface BankAccountService {
	
	 double depositAmount(double depAmt, int id);

		int createUserInfo(BankAccountInfo bankAccountInfo); //calling bank type info dherai type xa so BankAccountInfo nai rakheko

		BankAccountInfo getUserById(int id);

		int createUser();
		double withDrawAmount(double witAmt, int id);
		//int createUser();

}
