package com.jspider.springMVC.POJO;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class StudentPOJO {
	@Id
	private int id;
	private String name;
	private String email;
	private  long contact;
	private String city;
	private String username;
	private String password;
	
}
