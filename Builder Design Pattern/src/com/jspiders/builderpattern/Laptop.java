package com.jspiders.builderpattern;

public class Laptop {
	String brand;
	String model;
	String color;
	double price;
	int ram;
	int rom;
	String processor;
	int cam;
	
	public Laptop(String brand, String model, String color, double price, int ram, int rom, String processor, int cam) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
		this.cam = cam;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", model=" + model + ", color=" + color + ", price=" + price + ", ram=" + ram
				+ ", rom=" + rom + ", processor=" + processor + ", cam=" + cam + "]";
	}
	
	
	
}
