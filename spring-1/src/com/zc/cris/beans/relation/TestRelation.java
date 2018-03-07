package com.zc.cris.beans.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRelation {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-relation.xml");
		Object bean = context.getBean("person");
		System.out.println(bean);
		
		
	}
}
