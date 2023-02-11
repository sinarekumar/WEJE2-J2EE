package com.jspiders.hibernate.dao.delete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.TransactionalException;

import com.jspider.hibernate.dto.StudentDTO;

public class StudentDAODelete {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory=Persistence.createEntityManagerFactory("Student");
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
		} catch (TransactionalException e) {
			System.out.println("Transaction is commited");
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			StudentDTO student=manager.find(StudentDTO.class, 1);
			manager.remove(student);
			transaction.commit();
		} finally {
			closeConnection();
		}

	}
}
