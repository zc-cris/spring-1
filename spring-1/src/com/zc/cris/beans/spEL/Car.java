package com.zc.cris.beans.spEL;


public class Car {
	
	private String name;
	private Double price;
	
	//通过spEL表达式引用类的静态方法
	private Double width;
	
	
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", width=" + width + "]";
	}
	public Car() {
		super();
		System.out.println("car's constructor.......");
	}
	
	
	
}
