package com.vastika.bank_account_jdbc.dao;

import com.vastika.bank_account_jdbc.model.BankAccountInfo;

public interface BankAccountDao {
  double depositAmount(double depAmt, int id);

	int createUserInfo(BankAccountInfo bankAccountInfo); //dherai type xa so BankAccountInfo nai rakheko

	BankAccountInfo getUserById(int id);

	double withDrawAmount(double witAmt, int id);

	//int createUser();

}
