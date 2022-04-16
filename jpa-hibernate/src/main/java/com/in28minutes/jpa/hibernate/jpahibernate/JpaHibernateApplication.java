package com.in28minutes.jpa.hibernate.jpahibernate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.hibernate.jpahibernate.entity.Course;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.FullTimeEmployee;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.PartTimeEmployee;
import com.in28minutes.jpa.hibernate.jpahibernate.repository.CourseRepository;
import com.in28minutes.jpa.hibernate.jpahibernate.repository.EmployeeRepository;
import com.in28minutes.jpa.hibernate.jpahibernate.repository.StudentRepository;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.Review;
import com.in28minutes.jpa.hibernate.jpahibernate.entity.Student;;

@SpringBootApplication
public class JpaHibernateApplication implements CommandLineRunner //1
{
	private Logger logger = LoggerFactory.getLogger(this.getClass()); //4
	@Autowired
	private CourseRepository courseRepository; //2
	
	@Autowired
	private StudentRepository studentrepository; //9
	
	@Autowired
	private EmployeeRepository employeerepository; //15

	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception //3
	{
/*		Course course = repository.findById(10001L);
		
		logger.info("Course 10001 --> {} "+course);  //5
		
		//courseRepository.deleteById(10001L);//6
		
		courseRepository.save(new Course("Microservices in 100 steps"));//7
*/	
		//courseRepository.playWithEntityManager();//8
		
		//studentrepository.saveStudentWithPassport();//10
		
		//courseRepository.addHardCodedReviewsForCourse();//11
		
	/*	List<Review> reviews = new ArrayList<>();
		reviews.add(new Review("5", "Great Hands-on stuff."));
		reviews.add(new Review("5", "Nice course."));
		courseRepository.addReviewsForCourse(10003L, reviews);//12
		
*/		
		//studentrepository.insertHardCodedStudentAndCourse();//13
		//studentrepository.insertStudentAndCourse(new Student("John"), new Course("JavaScript in 100 steps"));//14
		
//		//16
//		employeerepository.insert(new PartTimeEmployee("Jill", new BigDecimal("50")));
//		employeerepository.insert(new FullTimeEmployee("Jack", new BigDecimal("10000")));
//		logger.info("All Employees --> {} ", employeerepository.retrieveAllEmployees());
	}

}
