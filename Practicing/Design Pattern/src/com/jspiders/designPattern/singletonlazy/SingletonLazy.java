package com.jspiders.designPattern.singletonlazy;

public class SingletonLazy {
	static int noOfTickets;
	static SingletonLazy singletonLazy;
	
	private SingletonLazy(int noOfTickets) {
		super();
		this.noOfTickets=noOfTickets;
	}
	
	public static SingletonLazy bookTickets(int noOfBooking) {
		if (singletonLazy==null) {
			singletonLazy=new SingletonLazy(100);
		}
		System.out.println("Booking "+noOfBooking+" Tickets");
		if (noOfBooking>noOfTickets) {
			System.out.println("Tickets not available");
			return singletonLazy;
		}
		System.out.println("Available tickets are "+noOfTickets);
		noOfTickets-=noOfBooking;
		return singletonLazy;
		
	}
	
	
	
}
