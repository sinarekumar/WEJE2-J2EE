package com.jspiders.builderpattern;

public class Mobile {
	String brand;
	String model;
	String color;
	double price;
	int ram;
	int memory;
	String os;
	int f_cam;
	int r_cam;
	int display_size;

	public Mobile(String brand,String model,String color,
			double price,int ram,int memory,String os,
			int f_cam,int r_cam,int display_size) {
		super();
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.price=price;
		this.ram=ram;
		this.memory=memory;
		this.os=os;
		this.f_cam=f_cam;
		this.r_cam=r_cam;
		this.display_size=display_size;	
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", color=" + color + ", price=" + price + ", ram=" + ram
				+ ", memory=" + memory + ", os=" + os + ", f_cam=" + f_cam + ", r_cam=" + r_cam + ", display_size="
				+ display_size + "]";
	}
	

}
