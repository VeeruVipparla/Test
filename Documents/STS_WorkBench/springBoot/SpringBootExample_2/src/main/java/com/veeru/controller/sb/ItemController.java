package com.veeru.controller.sb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.veeru.model.sb.Item;
import com.veeru.sevice.sb.ItemService;

@RestController
@ComponentScan(basePackages = "com.veeru.service.sb")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@PostMapping("/createItem")
	public Item insertItem(@RequestBody Item item) {
		Item itemData=new Item();
		itemData=itemService.createData(item);
		return itemData;
		
	}
	
	
	@GetMapping(value = "/item/{itemid}")
	public List<Item> insertItem(@PathVariable int itemid) throws Exception{
		
		List<Item> itemData=itemService.insertItem(itemid);
		
		return itemData;
	}
	
	/*
	 * @PostMapping("/item") public LisItem insertItem(@RequestBody Item item)
	 * throws Exception{
	 * 
	 * Item itemData=itemService.insertItem(item);
	 * 
	 * return itemData; }
	 */

}
