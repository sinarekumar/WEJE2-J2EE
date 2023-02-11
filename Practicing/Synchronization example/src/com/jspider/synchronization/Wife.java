package com.jspider.synchronization;

public class Wife extends Thread {
	Account account;

	public Wife(Account account) {
		super();
		this.account = account;
	}
	public void run() {
		account.deposit(2000);
		account.withdrow(3000);
	}
}
