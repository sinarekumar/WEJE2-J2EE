package com.jspider.singleton.withdraw;

import com.jspider.singleton.account.Account;

public class Withdraw {
	static Withdraw withdraw;
	static double withdrawAmount;
	
	public Withdraw(double withdrawAmount) {
		Withdraw.withdrawAmount=withdrawAmount;
	}
	public static Withdraw getWithdrawAmount(double withdrawAmount) {
		String msg=" WAIT..";
		char[] charArray=msg.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Your withdrow Amount is Rs. "+withdrawAmount);
		if (Account.getAccountBalance() < withdrawAmount) {
			System.out.println("Sorry..! Balance is insufficient");
			return withdraw;
		}
		Account.accountBalance-= withdrawAmount;
		return withdraw;
		
	}
}
