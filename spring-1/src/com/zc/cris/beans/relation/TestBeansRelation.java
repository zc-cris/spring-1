package com.zc.cris.beans.relation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestBeansRelation {

	@Test
	void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans-relation.xml");
		Object bean = applicationContext.getBean("address2");
		System.out.println(bean);
		bean = applicationContext.getBean("person");
		System.out.println(bean);
	}

}
