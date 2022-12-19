package com.test.mapping.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
//@Transactional
//@Embeddable
public class Student implements Serializable{//implements Serializable
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stdId", unique = true, nullable = false)
	private int stdId;
	
	@Column(name="stdName")
	private  String stdName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "studentcourse",   
    joinColumns = { @JoinColumn(name = "sid") },   
    inverseJoinColumns = { @JoinColumn(name = "cid") })  
	private  Set<Course> courses= new HashSet<>();
	

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	
	
	

}
