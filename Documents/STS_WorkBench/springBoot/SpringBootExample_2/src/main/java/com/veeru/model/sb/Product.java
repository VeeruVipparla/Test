package com.veeru.model.sb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productId")
	private int productId;
	@Column(name = "productName")
	private String productName;
	@Column(name = "price")
	private double price;
	
	/*
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "itemId")
	 */
	//@OneToMany(mappedBy = "Item", cascade = CascadeType.ALL)
	//private Item items;
	
	//private List<Item> items;
	
	//fetch=FetchType.EAGER,
	/*
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade =
	 * CascadeType.ALL) //@JoinColumn(name="itemId") private List<Item> items;
	 */
	
	
	
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="itemId")
	//private Item item;
	
	/*
	 * //@ManyToOne
	 * 
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name="itemId") private int itemId;
	 */

	
}
