package com.jspider.multithread.threads;

public class MyThreadMain {

	public static void main(String[] args) {
		//Executing multiple thread at one time...
		MyThread1 mythread1=new MyThread1();  //object called-1st class
		Thread thread=new Thread(mythread1);
		thread.setName("New Thread");
//		System.out.println(thread.getName());
		thread.setPriority(6);
		MyThread2 mythread2=new MyThread2();  //object called-2nd class
		Thread thread1=new Thread(mythread2);
		thread.setName("New Thread 2");
//		System.out.println(thread.getName());
		thread1.setPriority(10);
		thread.start();
		thread1.start();
	}

}
