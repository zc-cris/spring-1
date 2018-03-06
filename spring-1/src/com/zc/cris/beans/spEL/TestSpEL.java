package com.zc.cris.beans.spEL;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestSpEL {
	
	@Test
	void test() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-spEL.xml");
		Object bean = context.getBean("address");
		System.out.println(bean);
		bean = context.getBean("car");
		System.out.println(bean);
		bean = context.getBean("person");
		System.out.println(bean);
		
		
		
		
	}
}
