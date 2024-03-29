package com.in28minutes.jpa.hibernate.jpahibernate.repository;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.jpa.hibernate.jpahibernate.entity.Course;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.Passport;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.Student;

@Transactional
@Repository
public class StudentRepository 
{
	//In any repository class we can able to do 'talk to the EntityManager'
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//1. Auto wire
	@Autowired
	//2. use the below entity
	EntityManager em;
	
	//3. created methods 
	
	public Student findById(Long id)  // we can pass id then will get or retrieve the student details
	{
		return em.find(Student.class, id);
	}
	
	public Student save(Student student) // we can insert or update the student details
	{
		if(student.getId() == null){
			//insert
			em.persist(student);
		}
		else{
			//update
			em.merge(student);
		}
		
		return student;
	}
	
	// we can pass id then will delete the student details
	// Delete operation will change the database structure, its like retrieve.So Add @Transactional to avoid Errors
	public void deleteById(Long id)  
	{
		Student student = findById(id);
		em.remove(student);
	}
	
	//1st step in Student Repository
	public void saveStudentWithPassport() {
		Passport passport = new Passport("Z324562");
		em.persist(passport);
		
		Student student = new Student("Mike");
		student.setPassport(passport);
		em.persist(student);
		
	}
	
	//2nd step in Student Repository
	public void insertHardCodedStudentAndCourse() {
		Student student = new Student("Jack");
		Course course = new Course("Microservices in 100 steps");
		em.persist(student);
		em.persist(course);
		
		//How we can add this data into joint table
		student.addCourses(course);
		course.addStudents(student);
		em.persist(student);
	}
	
	//3nd step in Student Repository Generalized method
	public void insertStudentAndCourse(Student student, Course course ) {
	
		//How we can add this data into joint table
		student.addCourses(course);
		course.addStudents(student);
		em.persist(student);
		em.persist(course);
		
	}
}
