package com.jspider.synchronization;

public class Bank {
	
	public static void main(String[] args) {
		Account account=new Account(15000);
		Husband husband=new Husband(account);
		Wife wife=new Wife(account);
		husband.start();
		wife.start();
	}
}
