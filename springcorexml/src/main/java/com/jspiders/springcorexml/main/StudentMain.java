package com.jspiders.springcorexml.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml.bean.StudentBean;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("StudentConfig.xml");
		StudentBean studentBeam=applicationContext.getBean(StudentBean.class);
		System.out.println(studentBeam);
		((ClassPathXmlApplicationContext)applicationContext).close();

	}

}
