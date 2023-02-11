package com.jspiders.hibernate.dao.update;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.hibernate.TransactionException;

import com.jspider.hibernate.dto.StudentDTO;

public class StudentDAOUpdate {
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
		} catch (TransactionException e) {
			System.out.println("Transaction is commited");
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			StudentDTO student=manager.find(StudentDTO.class, 1);
			student.setCity("Nagar");
			manager.persist(student);
			transaction.commit();
			
		} finally {
			closeConnection();
		}

	}
}
