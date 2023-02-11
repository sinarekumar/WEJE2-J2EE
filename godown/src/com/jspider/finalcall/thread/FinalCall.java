package com.jspider.finalcall.thread;

import com.jspider.customer1.thread.Customer1;
import com.jspider.customer2.thread.Customer2;
import com.jspider.godown.resource.Godown;
import com.jspider.supplier.thread.Supplier;

public class FinalCall {

	public static void main(String[] args) {
		Godown godown= new Godown(100);
		Customer1 customer1=new Customer1(godown);
		Customer2 customer2=new Customer2(godown);
		Supplier supplier=new Supplier(godown);
		customer1.start();
		customer2.start();
		supplier.start();
	}

}
