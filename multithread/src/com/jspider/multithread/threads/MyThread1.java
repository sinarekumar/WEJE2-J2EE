package com.jspider.multithread.threads;

public class MyThread1 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName()	);
		for (int i = 1; i <= 5; i++) {
			System.out.println("MyThread is now running");	
		}
	}
}
