package com.m2m.exmp;

import java.io.Serializable;
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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Student", uniqueConstraints = { @UniqueConstraint(columnNames = "sID") }) // @Table(name="Student")

public class Student implements Serializable {

	private int sId;
	private String sName;
	private Set<Course> course;

	@Id
	@Column(name = "sId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getSid() {
		return sId;
	}

	public void setSid(int sId) {
		this.sId = sId;
	}

	@Column(name = "sName")
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "StudentCourse", joinColumns = { @JoinColumn(name = "sId") }, inverseJoinColumns = {
			@JoinColumn(name = "cId") })
	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	
		
		
	}


