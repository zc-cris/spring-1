package com.zc.cris;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringIOC {

	public static void main(String[] args) {
		
		//使用了 Spring 以后，第一和第二步我们就不用自己创建了，由 Spring 框架自动完成，也就是控制翻转的意思（IOC）
		//1. 创建 helloWorld 的对象
		//HelloWorld helloWorld = new HelloWorld();
		//2. 为这个实例对象赋值
		//helloWorld.setName("Spring");
		
		
		//1. 创建 spring 的 ioc 容器
		//ApplicationContext 代表IOC容器
		//ClassPathXmlApplicationContext ： 是ApplicationContext 接口的实现类，该实现类可以从类路径下加载配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2. 从 ioc 容器中获取 bean 对象
		//利用id定位到ioc容器中的bean（推荐）
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		
		//3. 调用这个实例的方法
		System.out.println(helloWorld.getName());
	}
}
