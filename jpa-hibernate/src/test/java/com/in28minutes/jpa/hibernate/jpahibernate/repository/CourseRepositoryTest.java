package com.in28minutes.jpa.hibernate.jpahibernate.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
import com.in28minutes.jpa.hibernate.jpahibernate.entity.Review;
import com.in28minutes.jpa.hibernate.jpahibernate.repository.CourseRepository;

@SpringBootTest(classes = JpaHibernateApplication.class)
public class CourseRepositoryTest 
{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;
	
	@Autowired
	EntityManager em;
	
	@Test
	public void findById_basic() 
	{
		Course course = repository.findById(10001L);
		assertEquals("JPA in 50 steps", course.getName());
	}
	
	@Test
	@DirtiesContext   // after performing delete operation it will reset data as it is so it doesn't affect to other tests
	public void deleteById_basic() 
	{
		repository.deleteById(10002L);				//after deleting we check,does the id exists or not
		assertNull(repository.findById(10002L));	// using assertNull we can achieve data is null or not
	}
	
	@Test
	@DirtiesContext   // after performing update operation it will reset data as it is so it doesn't affect to other tests
	public void save_basic() 
	{
		// Get a course
		Course course = repository.findById(10001L);
		assertEquals("JPA in 50 steps", course.getName());
		
		// Update details
		course.setName("JPA in 50 steps - Updated");
		repository.save(course);
		
		// Check value
		Course course1 = repository.findById(10001L);
		assertEquals("JPA in 50 steps - Updated", course1.getName());
	}
	
	@Test
	@DirtiesContext   
	public void playWithEntityManager() 
	{
		repository.playWithEntityManager();

	}
	
	@Test   
	@Transactional
	public void retriveReviewsForCourse() //***ToMany Default is Lazy Fetching
	{
		Course course = repository.findById(10001L);
		logger.info("{} --> ",course.getReviews());
	}
	
	@Test   
	@Transactional
	public void retriveCourseForReviews() //***ToOne Default is Eager Fetching
	{
		Review review = em.find(Review.class, 50001L);
		logger.info("{} --> ",review.getCourse());
	}
}
