package com.jspider.multithreadingMethods;

public class Student extends Thread {
	Pizza pizza;

	public Student(Pizza pizza) {
		super();
		this.pizza = pizza;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		pizza.orderPizza(40);
	}
}
