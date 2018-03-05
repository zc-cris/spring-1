package com.zc.cris;


public class Car {
	
	private String brand;
	private String location;
	private Integer maxSpeed;
	private Double price;
	public Car(String brand, String location, Double price) {
		super();
		this.brand = brand;
		this.location = location;
		this.price = price;
	}
	public Car(String brand, String location, Integer maxSpeed) {
		super();
		this.brand = brand;
		this.location = location;
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", location=" + location + ", maxSpeed=" + maxSpeed + ", price=" + price + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
