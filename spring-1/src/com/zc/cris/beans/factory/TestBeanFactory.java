package com.zc.cris.beans.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestBeanFactory {

	@Test
	void testStaticFactory() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-factory.xml");
		Object bean = context.getBean("car");
		System.out.println(bean);
	}
	
	@Test
	void testFactory() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-factory.xml");
		Object bean = context.getBean("car2");
		System.out.println(bean);
	}

}
