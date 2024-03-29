package com.in28minutes.jpa.hibernate.jpahibernate.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.jpa.hibernate.jpahibernate.JpaHibernateApplication;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.Course;

@SpringBootTest(classes = JpaHibernateApplication.class)
public class NativeQueryTest 
{
	//Native query --> refers to actual sql queries (referring to actual database objects). 
	//These queries are the sql statements which can be directly executed in database using a database client.
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	@Test
	public void native_queries_basic() 
	{
		Query query = em.createNativeQuery("select * from course", Course.class);
		List resultList = query.getResultList();
		logger.info("select * from course --> {} ", resultList);
	}
	
	@Test
	public void native_queries_with_parameter() 
	{
		Query query = em.createNativeQuery("select * from course where id = ?", Course.class); // ? --> Positional Parameter
		query.setParameter(1, 10001L);
		List resultList = query.getResultList();
		logger.info("select * from course --> {} ", resultList);
	}
	
	@Test
	public void native_queries_with_namedparameter() 
	{
		Query query = em.createNativeQuery("select * from course where id = :id", Course.class); // :id --> Named Parameter
		query.setParameter("id", 10001L);
		List resultList = query.getResultList();
		logger.info("select * from course --> {} ", resultList);
	}
	
	//In which situations will go for Native Query
	//1. Sometimes you have to set some cunning parameters, you want use some data base specific features which is not supported by JPA
	// in that case we can go for Native queries
	
	//2. when you have to do "Mass Update", Let's say i would want updated all the rows in a specific query.
	// in this situation you cann't do mass updated by using JPA - so we can go for Native queries
	
	// Example I want to update all time stamp
	
	@Test
	@Transactional
	public void native_queries_to_update() 
	{
		Query query = em.createNativeQuery("Update COURSE set last_updated_date = sysdate()", Course.class);
		int noOfRowsUpdated = query.executeUpdate();
		logger.info("noOfRowsUpdated --> {} ", noOfRowsUpdated);
	}
	
	
	
	
	
	
	
	
	
}
