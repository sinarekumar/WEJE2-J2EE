package com.jspider.customer1.thread;

import com.jspider.godown.resource.Godown;

public class Customer1 extends Thread {
	Godown godown;

	public Customer1(Godown godown) {
		super();
		this.godown = godown;
	}
	public void run() {
		godown.orderProduct(40);

	}
}
