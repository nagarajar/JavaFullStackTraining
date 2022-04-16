package com.in28minutes.jpa.hibernate.jpahibernate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.in28minutes.jpa.hibernate.jpahibernate.entity.Course;

//1. Spring data repository always a interface
//2. Extends from JpaRepository(Interface)
//4. using Spring Data Rest
@RepositoryRestResource(path = "course")
public interface CourseSpringDataRepository extends JpaRepository<Course, Long>
{
	//3. if you feel the default methods are not enough u can use custom methods as below
	
	List<Course> findByNameAndId(String name, Long id);
	
	List<Course> findByName(String name);
	
	List<Course> countByName(String name);
	
	List<Course> findByNameOrderByIdDesc(String name);
	
	List<Course> deleteByName(String name);
	
	@Query("select c from Course c where name like '%100 steps'")
	List<Course> courseWith100StepsInName();
	
	@Query(value = "select c from Course c where name like '%100 steps'", nativeQuery = true)
	List<Course> courseWith100StepsInNameUsingNativeQery();
	
	@Query(name = "query_get_100_steps_courses")
	List<Course> courseWith100StepsInNameUsingNamedQuery();
	
	
	
}
