/**
 * 
 */
package com.veeru.sevice.sb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.veeru.DAO.sb.ItemDao;
import com.veeru.model.sb.Item;
import com.veeru.model.sb.Product;

/**
 * @author veeru
 *
 */
@Service("itemService")
@ComponentScan(basePackages = "com.veeru.DAO.sb")
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemDao itemDao;

	@Override
	// @Transcation
	public List<Item> insertItem(int item) throws Exception {
		List<Item> itemData = itemDao.insertItem(item);
		return itemData;
	}

	@Override
	public Item createData(Item item) {
		Item itemData=itemDao.createData(item);
		return itemData;
	}

	
}
