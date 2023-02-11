package com.jspider.synchronization;

public class Account {
	double accountBalance;
	

	public Account(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}
	public synchronized void checkBalance() {
		System.out.println(accountBalance);
	}
	public synchronized void deposit(double amount) {
		accountBalance += amount;
		checkBalance();
	}
	public synchronized void withdrow(double amount) {
		if (accountBalance>=amount) {
			accountBalance-=amount;
		} else {
			System.out.println("Insufficient funds");
		}
		checkBalance();
	}
}
