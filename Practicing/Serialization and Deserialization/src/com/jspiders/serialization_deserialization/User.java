package com.jspiders.serialization_deserialization;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = -123456789l;
	int id;
	String name;
	String password;
	public User(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
}
