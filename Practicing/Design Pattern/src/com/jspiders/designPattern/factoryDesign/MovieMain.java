package com.jspiders.designPattern.factoryDesign;

import java.util.Scanner;

public class MovieMain {
	static boolean loop=true;
	static Movie movie;
	
	public static void main(String[] args) {
		movieFactory().playing();
	}
	

	private static Movie movieFactory() {
		System.out.println("Select movie for watching...: \n"+"1. Kantara \n"+
				"2. Singham \n"+"3. SarSenapati_HambirRao");
		Scanner scanner=new Scanner(System.in);
		int choose=scanner.nextInt();
		scanner.close();
		
		switch (choose) {
		case 1:
			movie=new Kantara();
			loop=false;
			return movie;
			
		case 2:
			movie=new Singham();
			loop=false;
			return movie;
			
		case 3:
			movie = new HambirRao();
			loop=false;
			return movie;
			
		default:
			break;
		}
		return movieFactory();
	
	}
}
