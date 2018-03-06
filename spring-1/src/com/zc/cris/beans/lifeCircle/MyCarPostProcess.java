package com.zc.cris.beans.lifeCircle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyCarPostProcess implements BeanPostProcessor {
	
	//bean的init方法前调用
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization-----"+bean+"----------"+beanName);
		
		//可以对bean进行过滤作用 
//		if("car".equals(beanName)) {
//        ....
//		}
		
		return bean;
	}
	
	//bean的init方法之后调用
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization-----"+bean+"----------"+beanName);
		
		//使用后置处理器进行bean的偷梁换柱
		Car car = new Car();
		car.setName("宾利");
		
		return car;
	}
	
}
