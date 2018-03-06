package com.zc.cris.beans.factory;

import java.util.HashMap;
import java.util.Map;

//实例工程的方法：先创建工厂本身，再调用工厂实例的普通方法来返回bean的实例
public class Factory {
	
	private Map<String, Car> cars = null;
	
	public Factory() {
		this.cars = new HashMap<>();
		this.cars.put("法拉利", new Car("法拉利", 123D));
		this.cars.put("帕拉梅拉", new Car("帕拉梅拉", 1321D));
	}
	public Car getCar(String name) {
		return this.cars.get(name);
	}
	
}
