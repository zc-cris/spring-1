package com.zc.cris.beans.lifeCircle;


public class Car {
	
	private String name;
	
	public Car() {
		System.out.println("car has been created");
	}
	public void setName(String name) {
		System.out.println("set name");
		this.name = name;
	}
	public void carInit() {
		System.out.println("car init !");
	}
	public void carDestroy() {
		System.out.println("car destroy !");
	}
	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
}
