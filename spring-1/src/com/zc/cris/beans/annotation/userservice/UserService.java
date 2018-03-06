package com.zc.cris.beans.annotation.userservice;

import org.springframework.stereotype.Service;

import com.zc.cris.beans.annotation.userdao.UserDao;

@Service
public class UserService {

	private UserDao userDao;
	public void add() {
		// TODO Auto-generated method stub
		userDao.save();
		System.out.println("service's add");
	}
}
