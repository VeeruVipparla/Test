package com.veeru.DAO.sb;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.veeru.model.sb.Product;
import com.veeru.util.sb.Hibernateutility;

@Repository("productDao")
public class ProductDAOImpl implements ProductDAO {

	Product productData = new Product();

	@Override
	public Product insetProduct(Product product) {
		Session session = Hibernateutility.getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(product);
		productData = (Product) session.get(Product.class, product.getProductId());
		transaction.commit();
		return productData;
	}

}
