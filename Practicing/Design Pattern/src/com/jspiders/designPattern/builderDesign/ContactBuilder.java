package com.jspiders.designPattern.builderDesign;

public class ContactBuilder {
	private int id;
	private String name;
	private String emailId;
	
	public ContactBuilder cId(int id) {
		this.id=id;
		return this;
	}
	public ContactBuilder cName(String name) {
		this.name=name;
		return this;
	}
	public ContactBuilder cEmailId(String emailId) {
		this.emailId=emailId;
		return this;
	}
	
	public Contact getContact() {
		Contact contact=new Contact(this.id,this.name,this.emailId);
		return contact;
		
	}
	
}
