package com.in28minutes.jpa.hibernate.jpahibernate.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity               //1.it is specialization of bean

//6. It used to reuse the query without rewriting, just by referring name of query you can achieve the same
//@NamedQuery(name="query_get_all_course", query="select c from Course c")  

//7. when you have multiple queries - more than one, you should use this named queries array
@NamedQueries(value= {
		@NamedQuery(name="query_get_all_course", query="select c from Course c"),
		@NamedQuery(name="query_get_100_steps_courses", query="select c from Course c where name like '%100 steps'")
})

//@Table(name = "CourseDetails")    // 3.Table annotation defines the name of the table, we can use this only entity and table names are different
public class Course 
{
	@Id				 //2. it indicated the below fled is primary key for the table	
	@GeneratedValue  // JPA will generate id or hibernate will provide id
	private Long id;
	
	//@Column(name = "fullname")  //4. Column annotation defines the name of the Column, we can use this only field name and table column names are different
	//@Column(name = "fullname", nullable = false) // this filed should ot be null 
	@Column(nullable = false)
	private String name;
	
	//8. OneToMany Relationship example a course may have many reviews
	@OneToMany(mappedBy = "course")
	private List<Review> reviews;
	
	//9. ManyToMany Relationship example A Course may have may many Students in the same way 
	// a student might have enrolled for many courses
	@ManyToMany(mappedBy = "courses") // it means the student is the Owning side
	@JsonIgnore
	private List<Student> students = new ArrayList<>();
	
	//5.How can we know date and time of last updates and created
	
	@UpdateTimestamp
	private LocalDateTime lastUpdatedDate;
	
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	protected Course() {
		super();
	}

	public Course(String name) {
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
	
	//getters and setters for reviews
	public List<Review> getReviews() {
		return reviews;
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	public void removeReview(Review review) {
		this.reviews.remove(review);
	}
	
	//getters and addStudents for students
	public List<Student> getStudents() {
		return students;
	}

	public void addStudents(Student students) {
		this.students.add(students);
	}

	@Override
	public String toString() {
		return String.format("Course[%s]", name);
	}


	
}
