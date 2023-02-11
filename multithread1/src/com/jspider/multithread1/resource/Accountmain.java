package com.jspider.multithread1.resource;

public class Accountmain {

	public static void main(String[] args) {
		Account account=new Account(5000);
		Husband husband=new Husband(account);
		Wife wife=new Wife(account);
		husband.start();
		wife.start();
		
	}

}
