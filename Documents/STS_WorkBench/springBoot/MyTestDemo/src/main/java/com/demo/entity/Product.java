package com.demo.entity;

public class Product {

	private int id;
	private String pname;
	private String batchNo;
	private double price ;
	private int noOfProduct;
	
	Product (int id, String pname, String batchNo, double price, int noOfProduct ){
		this.id=id;
		this.pname=pname;
		this.batchNo=batchNo;
		this.price=price;
		this.noOfProduct=noOfProduct;
		
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfProduct() {
		return noOfProduct;
	}

	public void setNoOfProduct(int noOfProduct) {
		this.noOfProduct = noOfProduct;
	}
}
