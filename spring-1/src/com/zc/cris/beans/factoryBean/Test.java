package com.zc.cris.beans.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-beanFactory.xml");
		Object bean = context.getBean("car");
		System.out.println(bean);
	}
}
