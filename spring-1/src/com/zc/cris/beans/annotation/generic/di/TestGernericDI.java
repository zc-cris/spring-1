package com.zc.cris.beans.annotation.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGernericDI {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-genericDI.xml");
		UserService<User> bean = (UserService<User>) context.getBean("userService");
		bean.say();
		
	}
	
}
