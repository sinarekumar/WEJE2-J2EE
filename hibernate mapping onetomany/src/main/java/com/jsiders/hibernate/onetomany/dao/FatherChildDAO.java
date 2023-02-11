package com.jsiders.hibernate.onetomany.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate.onetomany.dto.ChildDTO;
import com.jspiders.hibernate.onetomany.dto.FatherDTO;

public class FatherChildDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	public static void openConnection() {
		factory=Persistence.createEntityManagerFactory("OneToMany");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
		
	}
	public static void closeConnection() {
		if(factory!=null) {
			factory.close();
		}
		if(manager!=null) {
			manager.close();
		}
		if (transaction!=null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println("Transaction is committed...");
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			FatherDTO father1=new FatherDTO();
			father1.setId(1);
			father1.setName("Sachin");
			father1.setAge(55);
			
			ChildDTO child1=new ChildDTO();
			child1.setId(1);
			child1.setName("Rushi");
			child1.setAge(20);
			manager.persist(child1);
			
			ChildDTO child2=new ChildDTO();
			child2.setId(2);
			child2.setName("dadus");
			child2.setAge(23);
			manager.persist(child2);
			
			ChildDTO child3=new ChildDTO();
			child3.setId(3);
			child3.setName("panda");
			child3.setAge(25);
			manager.persist(child3);
			
			List<ChildDTO> children=Arrays.asList(child1,child2,child3);
			father1.setChildren(children);
			manager.persist(father1);
			transaction.commit();
		}finally {
			closeConnection();
		}
		
	}

}
