package com.in28minutes.jpa.hibernate.jpahibernate.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity               //1.it is specialization of bean
public class Review 
{
	@Id				 //2. it indicated the below fled is primary key for the table	
	@GeneratedValue  // JPA will generate id or hibernate will provide id
	private Long id;
	private String rating;
	private String description;
	
	//3. Many reviews are associated with one course
	@ManyToOne
	private Course course;
	
	protected Review() {
		super();
	}
	public Review(String rating,String description) {
		super();
		this.rating = rating;
		this.description = description;
	}
	
	public String getdDescription() {
		return description;
	}
	public void setDescription(String name) {
		this.description = name;
	}
	
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Long getId() {
		return id;
	}
	
	//getters and setters for course created
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return String.format("Review[%s %s]",rating, description);
	}

	
}
