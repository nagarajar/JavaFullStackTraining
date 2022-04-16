package com.in28minutes.jpa.hibernate.jpahibernate.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity   
//3. if you want to store all subclass like partime and fulltime employee details in a single table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // By default strategy will single table
//4. this will change DTYPE to below mentioned name
@DiscriminatorColumn(name="EmployeeType")
public abstract class Employee 
{
	@Id				 //1. it indicated the below fled is primary key for the table	
	@GeneratedValue  // JPA will generate id or hibernate will provide id
	private Long id;
	
	//@Column(name = "fullname")  //2. Column annotation defines the name of the Column, we can use this only field name and table column names are different
	//@Column(name = "fullname", nullable = false) // this filed should ot be null 
	@Column(nullable = false)
	private String name;
	
	protected Employee() {
		super();
	}

	public Employee(String name) {
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
	
	@Override
	public String toString() {
		return String.format("Course[%s]", name);
	}


	
}
