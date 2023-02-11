package com.jspiders.buildermain;

import com.jspiders.builderpattern.Laptop;
import com.jspiders.builderpattern1.LaptopBuilder;

public class LaptopMain {

	public static void main(String[] args) {
		Laptop laptop=new LaptopBuilder().brand("Acer Predator").
				model("Predator helios 300").color("black").
				processor("Intel Core i5-8th gen").getLaptop();
		System.out.println(laptop);

	}

}
