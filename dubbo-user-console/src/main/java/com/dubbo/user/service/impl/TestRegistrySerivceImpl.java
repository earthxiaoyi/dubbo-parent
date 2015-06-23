package com.dubbo.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dubbo.user.dao.UserDAO;
import com.dubbo.user.model.User;
import com.dubbo.user.service.TestRegistryService;

@Service("TestRegistryService")
public class TestRegistrySerivceImpl implements TestRegistryService {

	@Resource
	UserDAO userDao;
	
	public String siHello(String name) {
		// TODO Auto-generated method stub
		return "hello,"+name;
	}
	
	public void addUser(User user){
		userDao.insertUser(user);
	}

}
