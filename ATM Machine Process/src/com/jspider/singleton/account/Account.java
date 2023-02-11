package com.jspider.singleton.account;

public class Account {
	static Account account=new Account(10000);
	public static double accountBalance;
	
	public Account(double accountbalance) {
		Account.accountBalance=accountbalance;
	}
	public static double getAccountBalance() {
		return accountBalance;
	}
}
