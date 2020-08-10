package com.vastika.bank_account_jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
 public static final String  Driver_Name = "com.mysql.jdbc.Driver";
 public static final String  URL = "jdbc:mysql://bank-account-app.ctpumcezhxbj.us-east-2.rds.amazonaws.com:3306/bank_account_db?useSSL=false";
 public static final String User_Name = "root";
 public static final String Pass_Word = "adminroot1234";

 public static Connection getConnection() throws ClassNotFoundException, SQLException {
	 Connection conn = null;  // reference to create connection
	 Class.forName(Driver_Name);
	 conn=DriverManager.getConnection(URL,User_Name, Pass_Word);
	 return conn;
	 
 }
 
 
 
 
}
