package com.jspider.factorydesign.accountmain;

import java.util.Scanner;

import com.jspider.singleton.account.Account;
import com.jspider.singleton.withdraw.Withdraw;
import com.jspider.singleton.deposit.Deposit;
import com.jspider.singleton.checkBalence.CheckBalance;

public class AccountMain {
	static boolean loop=true;
	static Account account;
	public static void main(String[] args) {
		System.out.println("welcome to Banking...");
		System.out.println("For Banking Operation Please select below operations...");
		System.out.println("Select the operation :\n"+"1.Withdrow :\n"+"2.Deposit :\n"+"3.Check Balance :\n"+"4.Exit :\n");
		Scanner scanner=new Scanner(System.in);
		int operation=scanner.nextInt();
		switch (operation) {
		case 1:
			loop=false;
			System.out.println("Enter the withdraw amount ");
			int withd = scanner.nextInt();
			Withdraw.getWithdrawAmount(withd);
			return;	
		case 2:
			loop=false;
			System.out.println("Enter the deposit amount ");
			int depo = scanner.nextInt();
			Deposit.getDepositAmount(depo);
			return;	
		case 3:
			loop=false;
			System.out.println("your current account balance is ");
			CheckBalance.getCheckBalance();
			return;	
		case 4:
			loop=false;
			System.out.println("Thank you for visiting...");
		
		}
		
	}

}
