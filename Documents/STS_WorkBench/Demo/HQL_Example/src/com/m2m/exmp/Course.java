package com.m2m.exmp;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Course", uniqueConstraints = { @UniqueConstraint(columnNames = "cID") }) // @Table(name = "Course")
public class Course implements Serializable {
	private int cId;
	private String cName;
	private Set<Student> students;

	@Id
	@Column(name = "cId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getcId() {
		return cId;
	}

	@Column(name = "cId")
	public void setcId(int cId) {
		this.cId = cId;
	}

	@Column(name = "cName")
	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@ManyToMany(mappedBy = "courses", cascade = CascadeType.ALL)
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}
