package com.zc.cris.autowire;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestAutowire {

	@Test
	void test() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowire.xml");
		Object bean = applicationContext.getBean("person");
		System.out.println(bean);
		
		
	}
}
