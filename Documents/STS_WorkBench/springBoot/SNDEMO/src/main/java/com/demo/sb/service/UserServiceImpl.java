package com.demo.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.sb.dao.UserDao;
import com.demo.sb.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public List<User> insertUser(User user) {
		List<User> userList=userDao.insertUser(user);
		
		return userList;
	}

}
