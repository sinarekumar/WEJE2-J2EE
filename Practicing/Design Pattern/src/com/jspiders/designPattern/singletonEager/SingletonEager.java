package com.jspiders.designPattern.singletonEager;

public class SingletonEager {
	static int noOfTicket;
	static SingletonEager singletonEager=new SingletonEager(100);
	
	private SingletonEager(int noOfTicket) {
		this.noOfTicket=noOfTicket;
	}
	
	public static SingletonEager bookTicket(int noOfBooking) {
		System.out.println("Avaiable tickets : "+noOfTicket);
		System.out.println("bookings "+noOfBooking+" ticket");
		if (noOfBooking>noOfTicket) {
			System.out.println("Tickets not available");
			return singletonEager;
		}
		noOfTicket-=noOfBooking;
		System.out.println("available tickets "+noOfTicket);
		return singletonEager;
	
	}
}