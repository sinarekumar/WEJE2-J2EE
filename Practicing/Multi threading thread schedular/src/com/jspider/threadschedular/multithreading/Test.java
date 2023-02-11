package com.jspider.threadschedular.multithreading;

public class Test {
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.start();
		demo.setName(" Thread_.1 is running" );
		System.out.println(demo.getName());
		demo.setPriority(9);
		 
		
		Demo demo1=new Demo();
		demo1.start();
		demo1.setName(" Thread.2 is running");
		System.out.println(demo1.getName());
		demo1.setPriority(5);
	}
}
