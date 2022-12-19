/**
 * 
 */
package com.veeru.DAO.sb;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.veeru.model.sb.Item;
import com.veeru.model.sb.Product;
import com.veeru.util.sb.Hibernateutility;

/**
 * @author veeru
 *
 */
@Repository("itemDao")
public class ItemDaoImpl implements ItemDao {
	//select p.productId, p.productName, p.price,i.itemId,i.itemName 
	private final static String INSERT_ITEM_PRODUCT="from Product as p inner join Item as i where p.productId=:id";

	private final static String INSERT_ITEM_PRODUCT1="select p.productId, p.productName, p.price,i.itemId,i.itemName from Product as p inner join Item as i where p.productId=i.itemId";

	
	
	public List<Item> insertItem(int itemid) throws Exception{
		// TODO Auto-generated method stub
		Session session = Hibernateutility.getSession();
		//Transaction transaction = session.getTransaction();
		//transaction.begin();
		//session.save(item);
		//Item itemData = (Item) session.get(Item.class, itemid);
		
		//Query q=session.createQuery("from Product");
		
		//Query q=session.createQuery("from Item where itemId=:id");
		
		Query q=session.createQuery(INSERT_ITEM_PRODUCT);
		q.setParameter("id", itemid); 
		List<Item> list=q.list();
		
		//transaction.commit();
		return list;
		
	}

	@Override
	public Item createData(Item item)  {
		Item itemData=new Item();
		public Product createItem(Item item) {
			Session session = Hibernateutility.getSession();
			Transaction transaction = session.getTransaction();
			transaction.begin();
			session.save(item);
			itemData = (Item) session.get(Item.class, item.getItemId());
			transaction.commit();
			return itemData;
}
	}
