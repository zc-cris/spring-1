package com.zc.cris.beans.annotation.userservice;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zc.cris.beans.annotation.userdao.UserDao;

@Service
public class UserService {

	private UserDao userDao;
	
	@Autowired
	public void setUserDao(@Qualifier("userDaoImpl") UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void add() {
		userDao.save();
		System.out.println("service's add");
	}
}
