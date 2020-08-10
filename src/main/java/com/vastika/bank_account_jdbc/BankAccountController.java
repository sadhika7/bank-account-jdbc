package com.vastika.bank_account_jdbc;

import java.util.Scanner;

import com.vastika.bank_account_jdbc.model.BankAccountInfo;
import com.vastika.bank_account_jdbc.service.BankAccountService;
import com.vastika.bank_account_jdbc.service.BankAccountServiceImpl;

public class BankAccountController {
	

	public static void main(String[] args) {
		BankAccountService service= new BankAccountServiceImpl();
		Scanner input = new Scanner(System.in);
		String test = "y";
		do {
			System.out.println("======Welcome to your Bank Page=====");
			System.out.print("What Do you want to do? CreateAccount|Deposit|WithDraw?");
			String in = input.next();
			
			switch (in) {
			case "CreateAccount":
				System.out.println("Enter your Account name");
				String accountName = input.next();
				System.out.println("Enter your address");
				String address  = input.next();
				System.out.println("Enter your Mobile no");
				Long mobileNo = input.nextLong();
				System.out.println("Enter your SSN");
				String ssn = input.next();
				BankAccountInfo bankAccountInfo= new BankAccountInfo( accountName, address, mobileNo, ssn);
				int i =service.createUserInfo(bankAccountInfo);
				if (i!=0) {
					System.out.println("Account Created");
				}else {
					System.out.println("try again");
				}
				
				
				
				
			break;
			
			
			case "Deposit":
				System.out.println(" Enter your id");
				int id = input.nextInt();
				System.out.println("Enter deposit amount");
				double amount = input.nextDouble();
				service.depositAmount(amount, id);
				System.out.println("successful");
				
				
				break;
				
			case "Withdraw":
				System.out.println("Enter your id");
				int m = input.nextInt();
				System.out.println("Enter amount you want to withdraw");
				double w = input.nextDouble();
				double withdraw=service.withDrawAmount(w, m);
				if(withdraw!=0) {
					System.out.println("sucessful withdrawal");
				}else {
					System.out.println("Try again");
				}
				
			
				break;
				
			
			}

			System.out.println("Do you want to do something else?(Y/N)");
			test = input.next();
		} while (test.equalsIgnoreCase("y"));

	}

}
