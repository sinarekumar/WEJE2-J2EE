package com.jspiders.buildermain;

import com.jspiders.builderpattern.Mobile;
import com.jspiders.builderpattern1.MobileBuilder;

public class MobileMain {

	public static void main(String[] args) {
		Mobile mobile=new MobileBuilder().price(50000.00).brand("Apple iphone").color("Drak Blue").os("IOS").getMobile();
		System.out.println(mobile);
	}

}
