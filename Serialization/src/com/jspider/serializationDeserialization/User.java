package com.jspider.serializationDeserialization;

import java.io.Serializable;

public class User implements Serializable {
	 
	private static final long serialVersionUID = -81826006308614l;
	int id;
	String username;
	String password;
	
	public User(int id,String username,String password) {
		super();
		this.id=id;
		this.username=username;
		this.password=password;
	}
	@Override
	public String toString() {
		return "user [id=" +id + " ,username=" +username+ ",password=" +password + "]";
	}
}
