package com.jspider.multithreading2.runnableInterface;

public class Test1 {

	public static void main(String[] args) {
		Demo1 demo=new Demo1();
		Thread thread=new Thread(demo);
		thread.start();

	}

}
