package com.jspider.springMVC.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.hibernate.TransactionException;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspider.springMVC.POJO.StudentPOJO;
import com.mysql.cj.Query;

@Repository
public class StudentRepository {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static javax.persistence.Query query;
	private static String jpql;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("student");
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
				System.out.println("transaction already committed");
			}
		}
	}

	private StudentRepository service;

	public StudentPOJO login(String username, String password) {
		openConnection();
		transaction.begin();
		jpql = "from StudentPOJO " + "where username = '" + username + "' " + "and password ='" + password + "'";
		query = manager.createQuery(jpql);
		List<StudentPOJO> list = (List<StudentPOJO>) query.getResultList();
		transaction.commit();
		closeConnection();
		for (StudentPOJO pojo : list) {
			return pojo;
		}
		return null;
	}

	public StudentPOJO add(String name, String email, long contact, String city, String username, String password) {
		openConnection();
		transaction.begin();
		StudentPOJO pojo = new StudentPOJO();
		pojo.setName(name);
		pojo.setEmail(email);
		pojo.setContact(contact);
		pojo.setCity(city);
		pojo.setUsername(username);
		pojo.setPassword(password);
		manager.persist(pojo);
		transaction.commit();
		closeConnection();
		return pojo;
	}

	public StudentPOJO search(int id) {
		openConnection();
		transaction.begin();
		StudentPOJO pojo = manager.find(StudentPOJO.class, id);
		transaction.commit();
		closeConnection();
		return pojo;
	}

	public List<StudentPOJO> searchAll() {
		openConnection();
		transaction.begin();
		jpql = "from StudentPOJO";
		query = manager.createQuery(jpql);
		List<StudentPOJO> pojos = query.getResultList();
		transaction.commit();
		closeConnection();
		return pojos;
	}

	public StudentPOJO remove(int id) {
		openConnection();
		transaction.begin();
		StudentPOJO pojo = manager.find(StudentPOJO.class, id);
		if (pojo != null) {
			manager.remove(pojo);
		}
		transaction.commit();
		closeConnection();
		return pojo;
	}

	@GetMapping("/update")
	public String update(ModelMap map) {
		List<StudentPOJO> students = service.searchAll();
		map.addAttribute("students", students);
		return "UpdateStudent";
	}
	
	@PostMapping("/update")
	public String updateForm(@RequestParam int id,
			ModelMap map) {
		StudentPOJO student = service.search(id);
		if (student != null) {
			map.addAttribute("student", student);
		} else {
			map.addAttribute("msg", "Data not found..!!");
			List<StudentPOJO> students = service.searchAll();
			map.addAttribute("students", students);
		}
		return "UpdateStudent";
	}
	
	@PostMapping("/updateData")
	public String update(@RequestParam int id,
			@RequestParam String name,
			@RequestParam String email,
			@RequestParam long contact,
			@RequestParam String city,
			@RequestParam String username,
			@RequestParam String password,
			ModelMap map) {
		StudentPOJO student = service.search(id);
		if (student != null) {
			service.updateData(id, name, email, contact,
					city, username, password);
			map.addAttribute("msg", "Student updated successfully..!!");
			List<StudentPOJO> students = service.searchAll();
			map.addAttribute("students", students);
		}
		return "UpdateStudent";
	}

	public void updateData(int id, String name, String email, long contact, String city, String username,
			String password) {
		
		
	}

	

	

}