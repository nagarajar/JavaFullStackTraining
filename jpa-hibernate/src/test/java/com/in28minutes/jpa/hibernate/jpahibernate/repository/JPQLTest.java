package com.in28minutes.jpa.hibernate.jpahibernate.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.in28minutes.jpa.hibernate.jpahibernate.JpaHibernateApplication;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.Course;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.Student;


@SpringBootTest(classes = JpaHibernateApplication.class)
public class JPQLTest 
{
private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	@Test
	public void jpql_basic() 
	{
		Query query = 
				//em.createQuery("select c from Course c"); // without using Named query
				em.createNamedQuery("query_get_all_course"); // using Named query
		List resultList = query.getResultList();
		logger.info("select c from course c --> {} ", resultList);
	}
	
	@Test
	public void jpql_typed() 
	{
		//alt+shift+L - will help us to create a variable
		TypedQuery<Course> query = 
				//em.createQuery("select c from Course c", Course.class);  // without using Named query
				em.createNamedQuery("query_get_all_course", Course.class); // using Named query
		List<Course> resultList = query.getResultList();
		logger.info("select c from course c --> {} ", resultList);
	}
	
	@Test
	public void jpql_where() 
	{
		//alt+shift+L - will help us to create a variable
		TypedQuery<Course> query = 
				//em.createQuery("select c from Course c where name like '%100 steps'", Course.class); // without using Named query
				em.createNamedQuery("query_get_100_steps_courses", Course.class); // using Named query
		List<Course> resultList = query.getResultList();
		logger.info("select c from course c where name like '%100 steps' --> {} ", resultList);
	}
	
	@Test
	public void jpql_courses_without_students() 
	{
		TypedQuery<Course> query = 
				em.createQuery("select c from Course c where c.students is empty", Course.class); 
		List<Course> resultList = query.getResultList();
		logger.info("select c from Course where c.students is empty --> {} ", resultList);
	}
	
	@Test
	public void jpql_courses_with_atleast_2_students() 
	{
		TypedQuery<Course> query = 
				em.createQuery("select c from Course c where size(c.students) >= 2", Course.class); 
		List<Course> resultList = query.getResultList();
		logger.info("select c from Course where c.students is empty --> {} ", resultList);
	}
	
	@Test
	public void jpql_courses_ordered_by_students() 
	{
		TypedQuery<Course> query = 
				//em.createQuery("select c from Course c order by size(c.students)", Course.class); // by default its ascending order
				em.createQuery("select c from Course c order by size(c.students) desc", Course.class); // Descending order
		List<Course> resultList = query.getResultList();
		logger.info("select c from Course c order by size(c.students) desc --> {} ", resultList);
	}
	
	@Test
	public void jpql_students_with_passports_in_a_certain_pattern() 
	{
		TypedQuery<Student> query = 
				em.createQuery("select s from Student s where s.passport.number like '%1234%'", Student.class); 
		List<Student> resultList = query.getResultList();
		logger.info("select s from Student s where s.passport.number like '%1234%' --> {} ", resultList);
	}
	
	//We can perform below options also 
	//like 
	//BETWEEN 100 TO 1000
	//IS NULL
	//upper, lower, trim, length
	
	//JOIN => Select c, s from Course c JOIN c.students s    --> It will return only matching data from two tables

	@Test
	public void join() 
	{
		Query query = 
				em.createQuery("Select c, s from Course c JOIN c.students s"); 
		List<Object[]> resultList = query.getResultList();
		logger.info("Results size --> {} ", resultList.size());
		for(Object[] result:resultList) {
			logger.info("Course{} Student{} ",result[0], result[1]);
		}
	}
	
	//LEFT JOIN => Select c, s from Course c LEFT JOIN c.students s --> It will return matching as well unmatched data from Course table
	
	@Test
	public void left_join() 
	{
		Query query = 
				em.createQuery("Select c, s from Course c LEFT JOIN c.students s"); 
		List<Object[]> resultList = query.getResultList();
		logger.info("Results size --> {} ", resultList.size());
		for(Object[] result:resultList) {
			logger.info("Course{} Student{} ",result[0], result[1]);
		}
	}
	
	//CROSS JOIN => Select c, s from Course c, Student s --> It will return data from both table without considering matched or unmatched
	
	@Test
	public void cross_join() 
	{
		Query query = 
				em.createQuery("Select c, s from Course c, Student s"); 
		List<Object[]> resultList = query.getResultList();
		logger.info("Results size --> {} ", resultList.size());
		for(Object[] result:resultList) {
			logger.info("Course{} Student{} ",result[0], result[1]);
		}
	}
}
