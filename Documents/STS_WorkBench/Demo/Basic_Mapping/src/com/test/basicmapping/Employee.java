package com.test.basicmapping;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "employee2")
public class Employee {
	@Id//P.K
	@Column(name="empId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	
	@Column(name="empName")
	private String empName;
	
	@Temporal(TemporalType.DATE)
	@Column(name="doj")
	private Date doj;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="login")
	private Date login;
	
	@Column(name="salary")
	private Double salary;
	
	

	public Employee(Integer empId, String empName, Date doj, Date login, Double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.doj = doj;
		this.login = login;
		this.salary = salary;
	}
	public Employee() {}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Date getLogin() {
		return login;
	}

	public void setLogin(Date login) {
		this.login = login;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
