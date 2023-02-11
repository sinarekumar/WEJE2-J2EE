package com.jspider.customer2.thread;

import com.jspider.godown.resource.Godown;

public class Customer2 extends Thread{
	Godown godown;

	public Customer2(Godown godown) {
		super();
		this.godown = godown;
	}
	
	public void run() {
		godown.orderProduct(52);
	}

}
