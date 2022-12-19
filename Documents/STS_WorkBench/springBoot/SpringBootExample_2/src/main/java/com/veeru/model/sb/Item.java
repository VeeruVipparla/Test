package com.veeru.model.sb;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "Item")
@Data
public class Item{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "itemId")
	private int itemId;
	
	@Column(name = "itemName")
	private String itemName;
	
	//@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	//@ManyToOne(cascade = CascadeType.ALL)
	//@ManyToOne(targetEntity = Product.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	//@JoinColumn(name = "productId")
	//@ManyToOne
	//(targetEntity = Product.class)
	
	
	//@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name = "productId")
	@Column
	@ElementCollection(targetClass=Product.class)
	private List<Product> products;
	
	//@ManyToOne(cascade = CascadeType.ALL)
	//@JoinTable(name="Item")
   // private Product product;
	
	//@ManyToOne(fetch = FetchType.LAZY)
	/*
	 * @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,
	 * CascadeType.REFRESH, CascadeType.MERGE,CascadeType.REMOVE})
	 * 
	 * @JoinColumn(name = "productId") private Product product;
	 */
	
	//@OneToMany(mappedBy = "Product",cascade = CascadeType.ALL)
	//Product product;
  
}
