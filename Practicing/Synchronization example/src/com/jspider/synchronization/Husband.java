package com.jspider.synchronization;

public class Husband extends Thread{
	Account account;

	public Husband(Account account) {
		super();
		this.account = account;
	}
	public void run() {
		account.withdrow(5000);
		account.deposit(5000);

	}
}
