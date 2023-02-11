package com.jspider.singleton.checkBalence;

import com.jspider.singleton.account.Account;

public class CheckBalance {
	static CheckBalance checkBalance;
	
	public static double getCheckBalance() {
		if(checkBalance==null) {
			checkBalance=new CheckBalance();
		}
		System.out.println("Your Available balance is "+getCheckBalance());
		return Account.accountBalance;	
	}
}
