package com.jspiders.hibernate.dao.codeStanderdization;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.hibernate.TransactionException;

import com.jspider.hibernate.dto.StudentDTO;

import javax.persistence.EntityManager;

public class StudentDAOcs {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory=Persistence.createEntityManagerFactory("student");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
	}
	
	private static void closeConnection() {
		if (factory!=null) {
			factory.close();
		}
		if (manager!=null) {
			manager.close();
		}
		try {
			transaction.rollback();
		} catch (TransactionException e) {
			System.out.println("Transaction is commited");
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			StudentDTO student=new StudentDTO();
			student.setId(2);
			student.setName("chaitanya");
			student.setEmail("chaitanya@gmail.com");
			student.setContact(8523647855L);
			student.setCity("Pune");
			
			manager.persist(student);
			transaction.commit();
			
		} finally {
			closeConnection();
		}

	}

}
