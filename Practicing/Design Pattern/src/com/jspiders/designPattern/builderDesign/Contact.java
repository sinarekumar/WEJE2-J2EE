package com.jspiders.designPattern.builderDesign;

public class Contact {
	int id;
	String name;
	String emailId;
	public Contact(int id, String name, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", emailId=" + emailId + "]";
	}
	
	
}
