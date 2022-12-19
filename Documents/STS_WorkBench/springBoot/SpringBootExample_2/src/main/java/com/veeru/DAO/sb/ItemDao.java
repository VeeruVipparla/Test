/**
 * 
 */
package com.veeru.DAO.sb;

import java.util.List;

import com.veeru.model.sb.Item;

/**
 * @author veeru
 *
 */
public interface ItemDao {

	public List<Item> insertItem(int itemid) throws Exception;

	public Item createData(Item item);

}
