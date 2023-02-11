package com.jspiders.builderpattern1;

import com.jspiders.builderpattern.Laptop;

public class LaptopBuilder {
	private String brand;
	private String model;
	private String color;
	private double price;
	private int ram;
	private int rom;
	private String processor;
	private int cam;
	
	public LaptopBuilder brand(String brand) {
		this.brand=brand;
		return this;
	}
	public LaptopBuilder model(String model) {
		this.model=model;
		return this;
	}
	public LaptopBuilder color(String color) {
		this.color=color;
		return this;
	}
	public LaptopBuilder price(double price) {
		this.price=price;
		return this;
	}
	public LaptopBuilder ram(int ram) {
		this.ram=ram;
		return this;
	}
	public LaptopBuilder rom(int rom) {
		this.rom=rom;
		return this;
	}
	public LaptopBuilder processor(String processor) {
		this.processor=processor;
		return this;
	}public LaptopBuilder cam(int cam) {
		this.cam=cam;
		return this;
	}
	
	public Laptop getLaptop() {
		Laptop laptop=new Laptop(brand, model, color, price, ram, rom, processor, cam);
		return laptop;
	}
}
