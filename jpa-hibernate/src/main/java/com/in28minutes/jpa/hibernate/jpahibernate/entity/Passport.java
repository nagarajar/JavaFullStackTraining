package com.in28minutes.jpa.hibernate.jpahibernate.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity               //1.it is specialization of bean
public class Passport 
{
	@Id				 //2. it indicated the below fled is primary key for the table	
	@GeneratedValue  // JPA will generate id or hibernate will provide id
	private Long id;
	
	@Column(nullable = false)
	private String number;
	
	//Bidirection Relationship
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "passport") // mapped is always added only non owning relationship sides
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	protected Passport() {
		super();
	}

	public Passport(String number) {
		super();
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Passport[%s]", number);
	}
	
	
}