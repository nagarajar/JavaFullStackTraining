package com.in28minutes.jpa.hibernate.jpahibernate.repository;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.jpa.hibernate.jpahibernate.JpaHibernateApplication;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.Course;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.Passport;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.Student;
import com.in28minutes.jpa.hibernate.jpahibernate.repository.CourseRepository;

@SpringBootTest(classes = JpaHibernateApplication.class)
public class StudentRepositoryTest 
{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentRepository repository;
	
	@Autowired
	EntityManager em;
	
	// Eager Fetch ---> Eager fetching is the ability to efficiently load subclass data and related objects along with the base instances being queried.
	/*@Test
	public void retriveStudentAndPassportDetails() 
	{
		Student student = em.find(Student.class, 20001L);
		logger.info("student --> {} ",student);
		logger.info("passport --> {} ",student.getPassport());
	}
	*/
	//1.
	// Lazy Fetch ---> "Fetch it when you need it." The FetchType. LAZY tells Hibernate to only fetch the related entities from the database 
	//when you use the relationship. This is a good idea in general because there's no reason to select entities you don't need for your uses case.
	@Test
	@Transactional
	public void retriveStudentAndPassportDetails() 
	{
		Student student = em.find(Student.class, 20001L);
		logger.info("student --> {} ",student);
		logger.info("passport --> {} ",student.getPassport());
	}
	
	//3. completely reverse of above method - we can achieve Bi-directional here
	@Test
	@Transactional
	public void retrivePassportAndAssociatedStudentDetails() 
	{
		Passport passport = em.find(Passport.class, 40001L);
		logger.info("passport --> {} ",passport);
		logger.info("student --> {} ",passport.getStudent());
	}
	
	//2.
	//Session & Session Factory --> In Hibernate Terminology Session = Persistence Context
	//EntiryManger & Persistence Context
	//Transaction --> Consider below method, inside that method if any operation failed then all the operation before that will be rolled back
	// to achieve this rolled back we use this @Transactional Annotation or this concept
	
	// once we declare @Transactional - the Persistence Context will created
	// Persistence Context --> It is the place where all the entities which your operating are being stored and all the changes are get tracked 
	
	// once all the operations successfully completed then all the changes done on database will sent back to database
	
	//Using EntiryManager - we will interact with the Persistence Context
	@Test
	@Transactional
	public void someOperationToUnderstandPersistenceContext() 
	{//Transaction started here
		
		//Database Operation 1 - Retrieve student
		Student student = em.find(Student.class, 20001L);
		// Persistence Context (student)
													
		//Database Operation 2 - Retrieve passport
		Passport passport = student.getPassport();
		// Persistence Context (student, passport)
		
		//Database Operation 3 - Update passport
		passport.setNumber("G234576");
		// Persistence Context (student, passport++)
		
		//Database Operation 4 - Update student
		student.setName("Hari");
		// Persistence Context (student++, passport++)
	
	//Transaction ended here
		}
	
	//4. 
	@Test
	@Transactional
	public void retriveStudentAndCourses() 
	{
		Student student = em.find(Student.class, 20001L);
		logger.info("student --> {} ",student);
		logger.info("courses --> {} ",student.getCourses());
	}
}
