package com.jspider.multithread.threads;

public class MyThread2 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++) {
			System.out.println("If you see you will die...!");;
			
		}
	}
}

