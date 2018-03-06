package com.zc.cris.beans.annotation.userdao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		System.out.println("save user");
	}
}
