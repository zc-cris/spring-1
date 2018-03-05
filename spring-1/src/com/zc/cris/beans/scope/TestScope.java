package com.zc.cris.beans.scope;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestScope {

	@Test
	void test() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-scope.xml");
		
		Object bean = applicationContext.getBean("car");
		System.out.println(bean);
		bean = applicationContext.getBean("car");
		System.out.println(bean);

		
		
	}
	
	
	

}
