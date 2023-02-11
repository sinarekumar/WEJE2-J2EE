package com.jspider.multithread1.resource;
import com.jspider.multithread1.resource.Account;
public class Husband extends Thread {
	
	Account account;
	public Husband(Account account) {
		this.account=account;
	}
	public void run() {
		account.deposit(1000);
		account.withdrow(500);
	}
	
	
}
