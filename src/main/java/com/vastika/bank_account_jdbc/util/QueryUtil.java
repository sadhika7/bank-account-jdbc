package com.vastika.bank_account_jdbc.util;

public class QueryUtil {
	public final static String OPEN_ACCOUNT ="insert into account_info_tbl values (?,?,?,?,?) ";
	public final static String DEPOSIT =  " update account_blnc_tbl set deposit_amount = ?, balance =?  where id = ?";
	public final static String WITHDRAWL = "update account_blnc_tbl set withdraw_amount = ?, balance =? where id =?";
	public final static String BALANCE = "SELECT BALANCE FROM account_balance_tbl WHERE ID=?";

}
