package com.jspiders.hibernateonetoone.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.hibernate.TransactionException;

public class HusbandWifeDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("OneToOne");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction != null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println("Transaction is commited");
			}
		}
	}

	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			WifeDTO wife = new WifeDTO();
			wife.setId(1);
			wife.setName("Chandramukhi");
			wife.setEmail("chandra@gmail.com");
			wife.setAge(24);
			wife.setContact(6532142536L);
			manager.persist(wife);

			HusbandDTO husband = new HusbandDTO();
			husband.setId(1);
			husband.setName("Rushi");
			husband.setEmail("Rushichandra@gmail.com");
			husband.setAge(26);
			husband.setContact(9698745121L);
			husband.setWife(wife);
			manager.persist(husband);
			transaction.commit();

		} finally {
			closeConnection();
		}
	}
}
