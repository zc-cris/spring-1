package com.zc.cris.beans.annotation.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zc.cris.beans.annotation.userEntity.User;
import com.zc.cris.beans.annotation.usercontroller.UserController;
import com.zc.cris.beans.annotation.userdao.UserDao;
import com.zc.cris.beans.annotation.userservice.UserService;

class TestAnnotation {

	@Test
	void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
		UserService userService= (UserService) context.getBean("userService");
		System.out.println(userService);
//		
//		UserDao userDao = (UserDao) context.getBean("userDao");
//		System.out.println(userDao);
//		
//		UserController userController = (UserController) context.getBean("userController");
//		System.out.println(userController);
//		
//		User user = (User) context.getBean("user");
//		System.out.println(user);
//		
		
	}
}
