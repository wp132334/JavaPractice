package org.dimigo.oop;

public class Car3 {
	public String company;
	public String model;
	public String color;
	public int maxSpeed;
	public int price;
	
	public Car3() {
		
	}
	
	public Car3 (String company, String model, String color, int maxSpeed, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	
	public Car3 (String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public Car3 (String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	/*
	public Car3 (String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice) {
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	*/
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
	
	/*
	public void setCompany(String Company) {
		company = Company;
	}
	
	public void setModel(String Model) {
		model = Model;
	}
	
	public void setColor(String Color) {
		color = Color;
	}
	
	public void setMaxSpeed(int MaxSpeed) {
		maxSpeed = MaxSpeed;
	}
	
	public void setPrice(int Price) {
		price = Price;
	}
	*/
	
}
