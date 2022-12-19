package com.veeru.sevice.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.veeru.DAO.sb.ProductDAO;
import com.veeru.model.sb.Product;

@Service("productService")
@ComponentScan(basePackages = "com.veeru.DAO.sb")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDao;

	@Override
	public Product insertProduct(Product product) {
		Product productData = productDao.insetProduct(product);
		return productData;
	}

}