package com.jspider.multithreadingMethods;

public class Cafe extends Thread {
	Pizza pizza;
	public Cafe(Pizza pizza) {
		this.pizza=pizza;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		pizza.orderPizza(30);
	}
}
