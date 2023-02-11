package com.jspider.multithread1.resource;
import com.jspider.multithread1.resource.Account;
public class Wife extends Thread{
	Account account;
	public Wife(Account account) {
		this.account=account;
	}
	public void run() {
		account.deposit(1500);
		account.withdrow(1500);
		
	}
}
