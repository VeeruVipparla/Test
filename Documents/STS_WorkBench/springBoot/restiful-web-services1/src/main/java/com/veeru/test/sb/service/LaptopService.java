package com.veeru.test.sb.service;

import java.util.List;

import com.veeru.test.sb.model.Laptop;
import com.veeru.test.sb.model.User;

public interface LaptopService {
	
	Laptop insertLaptop(Laptop laptop)throws Exception;

	Laptop updateLaptop(Laptop laptop)throws Exception;

	Laptop getLaptop(int sNumber)throws Exception;

	List<Laptop> getLaptop()throws Exception;

	int deleteLaptop(int sNumber)throws Exception;

	User findOne(int id);

	
		
		
	

}
