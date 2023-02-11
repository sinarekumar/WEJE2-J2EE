package com.jspider.multithreadingMethods;

public class Main {
	public static void main(String[] args) {
		Pizza pizza=new Pizza(30);
		Cafe cafe=new Cafe(pizza);
		Student student=new Student(pizza);
		cafe.start();
		student.start();
	}
}
