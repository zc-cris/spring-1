package com.zc.cris.beans.autowire;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestAutowire {

	@Test
	void test() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-autowire.xml");
		Object bean = applicationContext.getBean("person");
		System.out.println(bean);
		
		
	}
}
