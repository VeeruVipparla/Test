package com.veeru.test.sb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.veeru.test.sb.dao.LaptopDao;
import com.veeru.test.sb.model.Laptop;
import com.veeru.test.sb.model.User;

@Service("laptopService")
@ComponentScan(basePackages ="com.veeru.test.sb.dao")
public class LaptopServiceImpl implements LaptopService{
    @Autowired
	LaptopDao laptopDao;
	@Override
	//@Transactional
	public Laptop insertLaptop(Laptop laptop)throws Exception {
	 Laptop	laptopData=laptopDao.insertLaptop(laptop);
		return laptopData;
	}
	@Override
	public Laptop updateLaptop(Laptop laptop)throws Exception {
		Laptop laptopData=laptopDao.updatelaptop(laptop);
		return laptopData;
	}
	@Override
	public Laptop getLaptop(int sNumber) throws Exception{
		return laptopDao.getlaptop(sNumber);
		 
	}
	@Override
	public List<Laptop> getLaptop()throws Exception {
		
		return laptopDao.getlaptop();
	}
	@Override
	public int deleteLaptop(int sNumber) throws Exception{
		
		return laptopDao.deletelaptop(sNumber);
	}
	
	@Override
	public User findOne(int id) {
		List<User> list = new ArrayList<>();
		User u = new User();
		User u1 = new User(100, "SNRaju");
		User u2 = new User(200, "Veeru");
		User u3 = new User(300, "Raga");

		list.add(u1);
		list.add(u2);
		list.add(u3);

		// for(User user:list)//
		for (int i = 0; i <= 5; i++) {
			if (list.get(i).getId() == id) {
				return list.get(i);
			}

		}

		return u;
	}

}

