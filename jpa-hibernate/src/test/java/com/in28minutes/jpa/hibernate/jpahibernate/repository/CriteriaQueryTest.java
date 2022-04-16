package com.in28minutes.jpa.hibernate.jpahibernate.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.in28minutes.jpa.hibernate.jpahibernate.JpaHibernateApplication;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.Course;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.Student;


@SpringBootTest(classes = JpaHibernateApplication.class)
public class CriteriaQueryTest 
{
private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	@Test
	public void all_courses() 
	{
		//Criteria Query means write the same query of sql using Java
		//target --> " select c from Course c " 
		
		//1. Use Criteria Builder to create a Criteria Query returning the expected result object
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Course> cq = cb.createQuery(Course.class);
		
		//2. Define roots for tables which are involved in the query
		Root<Course> courseRoot = cq.from(Course.class);
		
		//skip 3 and 4 in case you don't have any condition
		//3. Define Predicates etc using Criteria Builder
		//4. Add Predicates etc to the Criteria Query
		
		//5. Build the TypedQuery using entity manager and criteria query
		//alt+shift+L - will help us to create a variable
		TypedQuery<Course> query = 
				em.createQuery(cq.select(courseRoot));  
		List<Course> resultList = query.getResultList();
		logger.info("select c from course c --> {} ", resultList);
	}
	
	@Test
	public void all_courses_having_100Steps() 
	{
		//Criteria Query means write the same query of sql using Java
		//target --> " select c from Course c where name like '%100 Steps' " 
		
		//1. Use Criteria Builder to create a Criteria Query returning the expected result object
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Course> cq = cb.createQuery(Course.class);
		
		//2. Define roots for tables which are involved in the query
		Root<Course> courseRoot = cq.from(Course.class);
		
		//3. Define Predicates etc using Criteria Builder
		Predicate like100steps = cb.like(courseRoot.get("name"), "%100 steps");
		
		//4. Add Predicates etc to the Criteria Query
		cq.where(like100steps);
		
		//5. Build the TypedQuery using entity manager and criteria query
		//alt+shift+L - will help us to create a variable
		TypedQuery<Course> query = 
				em.createQuery(cq.select(courseRoot));  
		List<Course> resultList = query.getResultList();
		logger.info("select c from Course c where name like '%100 Steps' --> {} ", resultList);
	}
	
	@Test
	public void all_courses_without_students() 
	{
		//Criteria Query means write the same query of sql using Java
		//target --> " select c from Course c where c.students is empty " 
		
		//1. Use Criteria Builder to create a Criteria Query returning the expected result object
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Course> cq = cb.createQuery(Course.class);
		
		//2. Define roots for tables which are involved in the query
		Root<Course> courseRoot = cq.from(Course.class);
		
		//3. Define Predicates etc using Criteria Builder
		Predicate studentsIsEmpty = cb.isEmpty(courseRoot.get("students"));
		
		//4. Add Predicates etc to the Criteria Query
		cq.where(studentsIsEmpty);
		
		//5. Build the TypedQuery using entity manager and criteria query
		//alt+shift+L - will help us to create a variable
		TypedQuery<Course> query = 
				em.createQuery(cq.select(courseRoot));  
		List<Course> resultList = query.getResultList();
		logger.info("select c from Course c where c.students is empty --> {} ", resultList);
	}
	
	@Test
	public void join_courses_and_students() 
	{
		//Criteria Query means write the same query of sql using Java
		//target --> " select c from Course c JOIN c.students s " 
		
		//1. Use Criteria Builder to create a Criteria Query returning the expected result object
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Course> cq = cb.createQuery(Course.class);
		
		//2. Define roots for tables which are involved in the query
		Root<Course> courseRoot = cq.from(Course.class);
		
		//3. Define Predicates etc using Criteria Builder
		Join<Object, Object> join = courseRoot.join("students");
		
		//4. Add Predicates etc to the Criteria Query
		
		//5. Build the TypedQuery using entity manager and criteria query
		//alt+shift+L - will help us to create a variable
		TypedQuery<Course> query = 
				em.createQuery(cq.select(courseRoot));  
		List<Course> resultList = query.getResultList();
		logger.info("select c from Course c JOIN c.students s --> {} ", resultList);
	}

	@Test
	public void left_join_courses_and_students() 
	{
		//Criteria Query means write the same query of sql using Java
		//target --> " select c from Course c LEFT JOIN c.students s " 
		
		//1. Use Criteria Builder to create a Criteria Query returning the expected result object
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Course> cq = cb.createQuery(Course.class);
		
		//2. Define roots for tables which are involved in the query
		Root<Course> courseRoot = cq.from(Course.class);
		
		//3. Define Predicates etc using Criteria Builder
		Join<Object, Object> join = courseRoot.join("students", JoinType.LEFT);
		
		//4. Add Predicates etc to the Criteria Query
		
		//5. Build the TypedQuery using entity manager and criteria query
		//alt+shift+L - will help us to create a variable
		TypedQuery<Course> query = 
				em.createQuery(cq.select(courseRoot));  
		List<Course> resultList = query.getResultList();
		logger.info("select c from Course c LEFT JOIN c.students s --> {} ", resultList);
	}
}
