package com.zc.cris.beans.factoryBean;

import org.springframework.beans.factory.FactoryBean;


//自定义的factoryBean需要实现spring框架为我们提供的接口 FactoryBean
public class CarFactoryBean implements FactoryBean<Car>{

	private String carName;
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	//返回bean的对象
	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		car.setName(carName);
		return car;
	}

	//返回bean的类型
	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}
	
	//返回car这个bean是否是单例的
	@Override
	public boolean isSingleton() {
		return true;
	}
}
