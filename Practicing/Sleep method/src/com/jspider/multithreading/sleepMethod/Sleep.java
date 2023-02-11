package com.jspider.multithreading.sleepMethod;

public class Sleep {
	public static void main(String[] args) {
		String demo="Hello world...";
		char[] charArray=demo.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
