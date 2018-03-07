package com.zc.cris.beans.annotation.userdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zc.cris.beans.annotation.userEntity.User;

@Repository
public class UserDaoImpl2 implements UserDao {

	@Autowired(required=false)
	private User user;
	
	@Override
	public void save() {
		System.out.println(user);
		System.out.println("save user");
	}
}
