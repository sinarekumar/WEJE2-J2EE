package com.jspiders.designPattern.builderDesign;

public class ContactMain {

	public static void main(String[] args) {
		Contact contact=new ContactBuilder().cId(01).cName("Kumar")
				.cEmailId("Kumar@gmail.com").getContact();
		System.out.println(contact);
	}

}
