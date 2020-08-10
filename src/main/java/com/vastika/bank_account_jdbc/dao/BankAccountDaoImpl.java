package com.vastika.bank_account_jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vastika.bank_account_jdbc.model.BankAccountInfo;
import com.vastika.bank_account_jdbc.util.DBUtil;
import com.vastika.bank_account_jdbc.util.QueryUtil;

public class BankAccountDaoImpl implements BankAccountDao{
	@Override
	public double depositAmount(double depAmt, int id) {
		// dao bata copy garyo ani esma kasari deposit garne vanera lekhne
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement psBalance = conn.prepareStatement(QueryUtil.BALANCE);
				PreparedStatement psDeposit = conn.prepareStatement(QueryUtil.DEPOSIT);

		) {

			psBalance.setInt(1, id);
			double newBalance = depAmt;
			ResultSet rs = psBalance.executeQuery();
			if (rs.next()) {
				double balance = rs.getDouble("balance");
				newBalance = balance + depAmt;
			}
			psDeposit.setDouble(1, depAmt);
			psDeposit.setDouble(2, newBalance);
			psDeposit.setInt(3, id);
			psDeposit.execute();
			return newBalance;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return depAmt;
	}
@Override
	public  double withDrawAmount(double witAmt, int id) {
		try (Connection con = DBUtil.getConnection();
				PreparedStatement psBalance = con.prepareStatement(QueryUtil.BALANCE);
				PreparedStatement psWithdraw = con.prepareStatement(QueryUtil.WITHDRAWL);

		) {

			double newBalance = witAmt;
			ResultSet rs = psBalance.executeQuery();
			if (rs.next()) {
				double balance = rs.getDouble(4);
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
	public  int createUserInfo(BankAccountInfo info) {
		int i =0;
		try (Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.OPEN_ACCOUNT);){
			ps.setInt(1, info.getId());
			ps.setString(2, info.getAccountname());
			ps.setString(3, info.getAddress());
			ps.setLong(4, info.getMobileNo());
			ps.setString(5, info.getUniqueIdType());
			
			//ps.executeUpdate();
			i = ps.executeUpdate();
			
			
		}catch (ClassNotFoundException| SQLException e) {
			e.printStackTrace(); }
		return i;
		
	}
@Override
public BankAccountInfo getUserById(int id) {
	BankAccountInfo user=null;
	try (Connection conn=DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(QueryUtil.GETUSER);
			
			){
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			 user = new BankAccountInfo( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getLong(4), rs.getString(5));
			
			
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	
	return user;
}

}


