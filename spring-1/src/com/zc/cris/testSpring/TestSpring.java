package com.zc.cris.testSpring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zc.cris.Car;

class TestSpring {

	
	
	/*
	 * 测试通过p命名空间来为bean赋值
	 */
	@Test
	void testPnameSpace() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object bean = applicationContext.getBean("person5");
		System.out.println(bean);
		
		
	}
	
	
	/*
	 * 测试util schema 命名空间定义集合，达到重用的效果
	 */
	@Test
	void testUtilSchema() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object bean = applicationContext.getBean("person4");
		System.out.println(bean);
	}
	
	
	
	/*
	 * 测试properties属性（主要是用于设置数据库的参数）
	 */
	@Test
	void testProperties() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object bean = applicationContext.getBean("dataSource");
		System.out.println(bean);
	}
	
	
	/*
	 * 测试bean的map类型的属性
	 */
	@Test
	void testMapProperty() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object bean = applicationContext.getBean("person3");
		System.out.println(bean);
		
		
		
	}
	
	
	
	/*
	 * 测试bean的集合属性赋值
	 */
	@Test
	void testCollectionProperty() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object bean = applicationContext.getBean("person2");
		System.out.println(bean);
		
	}
	
	
	
	/*
	 * 测试为bean的属性的两种方式：setter和构造方法
	 */
	@Test
	void testProperty() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car1 = (Car) applicationContext.getBean("car1");
//		System.out.println(car1);
		Car car2 = (Car) applicationContext.getBean("car2");
		System.out.println(car2);
//		System.out.println(applicationContext.getBean("person"));
	}
}
