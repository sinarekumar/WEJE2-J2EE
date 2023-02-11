package com.jspider.multithread.threads;

public class MyThread3 extends Thread
{
	public void run() {
		for (int i = 1; i<=5; i++) {
			System.out.println("Bhool Bhulaiya");	
		}
	}
}
