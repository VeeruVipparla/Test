package com.demo.entity;

import java.util.List;

public interface IProductService {

	List<Product> findAll();

	Product getProductById(int id);

}
