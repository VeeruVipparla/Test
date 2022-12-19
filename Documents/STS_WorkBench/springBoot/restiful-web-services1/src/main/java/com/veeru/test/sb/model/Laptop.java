package com.veeru.test.sb.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.validator.constraints.NotBlank;

//import lombok.Data;

//@Data
@Entity
@Table(name = "laptop2")
public class Laptop implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@GenericGenerator(name = "native", strategy = "native")
	@Column(name="snumber")
	//@NotNull("")
	 int sNumber;
	
		/*
		 * @Column(name="company") String company;
		 */
	@Column(name="name")
	//@NotNull(message = "Name is not Null")
	//@NotEmpty(message = "Model is not Empty")
	//@NotBlank(message = "Name may not be blank")
	//@Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long") 
	 String name;
	
	@Column(name="model")
	//@NotNull(message = "Model is not Null")
	//@NotEmpty(message = "Model is not Empty")
	//@NotBlank(message = "Model may not be blank")
	//@Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long") 
	 String model;

	public int getsNumber() {
		return sNumber;
	}

	public void setsNumber(int sNumber) {
		this.sNumber = sNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	

	
	
	
	
	


}
