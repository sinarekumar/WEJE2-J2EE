package com.jspider.multithreading.main;

import com.jspider.multithreading1.Demo;
import com.jspider.multithreading2.runnableInterface.Demo1;

public class Main {

	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.start();
		
		Demo1 demo1=new Demo1();
		Thread thread=new Thread(demo1);
		thread.start();
		

	}

}
