package com.jspiders.builderpattern1;

import com.jspiders.builderpattern.Mobile;

public class MobileBuilder {
	private String brand;
	private String model;
	private String color;
	private double price;
	private int ram;
	private int memory;
	private String os;
	private int f_cam;
	private int r_cam;
	private int display_size;
	
	public MobileBuilder brand(String brand) {
		this.brand=brand;
		return this;
	}
	public MobileBuilder model(String model) {
		this.model=model;
		return this;
	}
	public MobileBuilder color(String color) {
		this.color=color;
		return this;
	}
	public MobileBuilder price(double price) {
		this.price=price;
		return this;
	}
	public MobileBuilder ram(int ram) {
		this.ram=ram;
		return this;
	}
	public MobileBuilder memory(int memory) {
		this.memory=memory;
		return this;
	}
	public MobileBuilder os(String os) {
		this.os=os;
		return this;
	}
	public MobileBuilder f_cam(int f_cam) {
		this.f_cam=f_cam;
		return this;
	}
	public MobileBuilder r_cam(int r_cam) {
		this.r_cam=r_cam;
		return this;
	}
	public MobileBuilder display_size(int display_size) {
		this.display_size=display_size;
		return this;
	}
	
	public Mobile getMobile() {
		Mobile mobile=new Mobile(this.brand,this.model,
				this.color,this.price,this.ram,this.memory,
				this.os,this.f_cam,this.r_cam,this.display_size);
		return mobile;
		
	}
}
