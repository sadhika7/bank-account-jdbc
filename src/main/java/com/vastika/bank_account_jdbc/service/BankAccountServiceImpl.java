package com.vastika.bank_account_jdbc.service;

import com.vastika.bank_account_jdbc.dao.BankAccountDao;
import com.vastika.bank_account_jdbc.dao.BankAccountDaoImpl;
import com.vastika.bank_account_jdbc.model.BankAccountBalance;
import com.vastika.bank_account_jdbc.model.BankAccountInfo;

public class BankAccountServiceImpl implements BankAccountService {
	
	BankAccountDao bankAccountDao = new BankAccountServiceImpl();
	
	
	public int creatNewAccount(BankAccountInfo accountInfo) {
		return bankAccountDao.createNewAccount(accountInfo);
	}

	public int saveAccountInfo(BankAccountInfo accountInfo) {
		// TODO Auto-generated method stub
		return bankAccountDao.SaveAccountInfo(accountInfo);
	}

	public int updateAccountInfo(BankAccountInfo accountInfo) {
		// TODO Auto-generated method stub
		return bankAccountDao.updateAccountInfo(accountInfo);
	}

	public void DeleteAccountInfo(String unique_id_type) {
		// TODO Auto-generated method stub
		
	}

	public int SaveAccountBalance(BankAccountBalance accountBalance) {
		// TODO Auto-generated method stub
		return bankAccountDao.SaveAccountBalance(accountBalance);
	}

	public int UpdateAccountBalance(BankAccountBalance accountBalance) {
		// TODO Auto-generated method stub
		return bankAccountDao.UpdateAccountBalance(accountBalance);
	}
	
	

}
  
  
  

}
