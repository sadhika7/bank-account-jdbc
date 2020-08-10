package com.vastika.bank_account_jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vastika.bank_account_jdbc.dao.BankAccountDao;
import com.vastika.bank_account_jdbc.dao.BankAccountDaoImpl;
import com.vastika.bank_account_jdbc.model.BankAccountInfo;
import com.vastika.bank_account_jdbc.util.DBUtil;
import com.vastika.bank_account_jdbc.util.QueryUtil;

public class BankAccountServiceImpl implements BankAccountService {
	private BankAccountDao bankdao = new BankAccountDaoImpl();

	@Override
	public double depositAmount(double depAmt, int id) {
		// TODO Auto-generated method stub
		return bankdao.depositAmount(depAmt, id);
	}

	@Override
	public int createUserInfo(BankAccountInfo bankAccountInfo) {
		// TODO Auto-generated method stub
		return bankdao.createUserInfo(bankAccountInfo);
	}

	@Override
	public BankAccountInfo getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public  double withDrawAmount(double witAmt, int id) {
		try (Connection con = DBUtil.getConnection();
				PreparedStatement psBalance = con.prepareStatement(QueryUtil.BALANCE);
				PreparedStatement psWithdraw = con.prepareStatement(QueryUtil.WITHDRAWL);

		) {

			double newBalance = witAmt;
			psBalance.setInt(1, id);
			ResultSet rs = psBalance.executeQuery();
			if (rs.next()) {
				double balance = rs.getDouble("balance");
				newBalance = balance - witAmt;

			}
			psWithdraw.setDouble(1, witAmt);
			psWithdraw.setDouble(2, newBalance);
			psWithdraw.setInt(3, id);
			psWithdraw.execute();
			return newBalance;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return witAmt;

	}
	@Override
	public int createUser() {
		// TODO Auto-generated method stub
		return 0;
	}

}
