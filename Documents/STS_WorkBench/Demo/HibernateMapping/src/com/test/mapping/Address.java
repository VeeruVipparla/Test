package com.test.mapping;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="address")
public class Address {
	
	
	@Id
	@Column(name="aid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	
	@Column(name="street")
	private String street;
	
	@Column(name = "city")
	private String City;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "zipcode")
	private String zipcode;
	
	//@OneToMany(mappedBy = "address", cascade =CascadeType.ALL)
	//Customer customer;
	@OneToMany(mappedBy = "address", cascade =CascadeType.ALL)
	Set<Customer> customer=new HashSet<>();
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	/*
	 * public Customer getCustomer() { return customer; } public void
	 * setCustomer(Customer customer) { this.customer = customer; }
	 */
	public Set<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}
	
	
	

}
