package com.jspider.multithreadingMethods;

public class Pizza {
	int noOfPizza;

	public Pizza(int noOfPizza) {
		super();
		this.noOfPizza = noOfPizza;
	}
	public void checkPizza() {
		System.out.println(noOfPizza);
	}
	public synchronized void orderPizza(int noOfPizza) {
		System.out.println("Ordering "+noOfPizza+" Pizzas");
		if(noOfPizza > checkPizza()) {
			try {
				System.out.println("Right now pizza is not available...");
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void bakePizzas(int noOfPizza ) {
		this.noOfPizza+=noOfPizza;
		System.out.println("Baking "+noOfPizza+" pizzas");
		System.out.println(checkPizza() +"pizzas available");
		this.notify();
	}
}
