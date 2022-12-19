package com.veeru.test.sb.dao;

import java.util.List;

import com.veeru.test.sb.model.Laptop;

public interface LaptopDao {

	Laptop insertLaptop(Laptop laptop)throws Exception;

	Laptop updatelaptop(Laptop laptop)throws Exception;

	Laptop getlaptop(int sNumber)throws Exception;

	List<Laptop> getlaptop()throws Exception;

	int deletelaptop(int sNumber)throws Exception;

	

	


}
