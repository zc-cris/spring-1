package com.zc.cris.beans.factory;

import java.util.HashMap;
import java.util.Map;

//静态工厂方法：直接调用静态工厂的静态方法就可以返回一个bean的实例对象
public class StaticFactory {
	
	private static Map<String, Car> map = new HashMap<>();
	static{
		map.put("奥迪", new Car("奥迪", 1234567D));
		map.put("保时捷", new Car("保时捷", 23456789D));
	}
	
	public static Car getCar(String name) {
		return map.get(name);
	}
	
}
