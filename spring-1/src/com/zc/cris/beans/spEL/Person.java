package com.zc.cris.beans.spEL;


public class Person {
	
	private String name;
	private Car car;
	
	//引用address bean对象的city属性
	private String city;
	
	//根据car的price值确定info的值：car的price>1000000 :info为有钱人
	private String info;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", car=" + car + ", info=" + info + "]";
	}
	
	
	
}
