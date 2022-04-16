package com.in28minutes.jpa.hibernate.jpahibernate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity               //1.it is specialization of bean
public class Student 
{
	@Id				 //2. it indicated the below fled is primary key for the table	
	@GeneratedValue  // JPA will generate id or hibernate will provide id
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@OneToOne(fetch = FetchType.LAZY) // Owning side 
	private Passport passport;
	
	//3. ManyToMany Relationship example A Course may have may many Students in the same way 
	// a student might have enrolled for many courses
	@ManyToMany
	// Only one Owning side - we can declare JoinTable annotation
	// JoinTable annotation is used to create a joint table s well to alter the name of table as well columns
	@JoinTable(name = "STUDENT_COURSE",
		joinColumns = @JoinColumn(name = "STUDENT_ID"),
		inverseJoinColumns = @JoinColumn(name = "COURSE_ID")
		)
	private List<Course> courses = new ArrayList<>();
	
	protected Student() {
		super();
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}
	
	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	//getters and addCourses for courses	
	public List<Course> getCourses() {
		return courses;
	}

	public void addCourses(Course courses) {
		this.courses.add(courses);
	}

	@Override
	public String toString() {
		return String.format("Student[%s]", name);
	}
	
	
}
