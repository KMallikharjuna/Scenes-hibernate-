package com.lpa.tourism.scenes.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lpa.tourism.scenes.config.DBConfig;
import com.lpa.tourism.scenes.entities.Employee;

public class EmployeeDAO {
	private Session session = new DBConfig().getSession();
	
	public List<Employee> getAll(){
		return session
				.createQuery("from Employee", Employee.class)
				.list();
	}

	public void save(Employee emp) {
		Transaction tx = session.beginTransaction();
		session.persist(emp);
		tx.commit();
		System.out.println("Employee has been registered successfully..");
	}

	public Employee getById(int id) {
		return session.get(Employee.class, id);
	}
}
