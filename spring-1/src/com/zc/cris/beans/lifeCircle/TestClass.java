package com.zc.cris.beans.lifeCircle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-lifeCircle.xml");
		System.out.println(context.getBean("car"));
		//关闭ioc容器
		context.close();
	}
}
