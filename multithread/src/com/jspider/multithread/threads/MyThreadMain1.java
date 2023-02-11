package com.jspider.multithread.threads;

public class MyThreadMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 myThread3=new MyThread3();
		myThread3.start();
		MyThread4 myThread4=new MyThread4();
		myThread4.start();
	}

}
