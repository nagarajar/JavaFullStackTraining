package com.in28minutes.jpa.hibernate.jpahibernate.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.jpa.hibernate.jpahibernate.entity.Course;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.Employee;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.Review;

@Transactional
@Repository
public class EmployeeRepository 
{
	//In any repository class we can able to do 'talk to the EntityManager'
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//1. Auto wire
	@Autowired
	//2. use the below entity
	EntityManager em;
	
	//3. created methods 
	
	// Insert Employee
	public void insert(Employee employee) {
		em.persist(employee);
	}
	
	//Retrieve all employee
	
	public List<Employee> retrieveAllEmployees()  
	{
		return em.createQuery("select e from Employee e", Employee.class).getResultList();
	}
	
			
}
