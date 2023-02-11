package com.jspider.singleton.deposit;

import com.jspider.singleton.account.Account;

public class Deposit {
	static Deposit deposit;
	static double depositAmount;
	
	public Deposit(Double depositAmount) {
		Deposit.depositAmount=depositAmount;
	}
	public static void getDepositAmount(double depositAmount) {
		String msg="WAIT...";
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
		System.out.println("Your Deposited amount is "+ depositAmount);
		if (deposit==null) {
			deposit=new Deposit(depositAmount);
		}
		Account.accountBalance += depositAmount;
		System.out.println("Rs. "+depositAmount+ "Amount is successfully deposited to your bank Account...");
	}

}
