package org.dimigo.oop;

public class Car2 {
	public String company;
	public String model;
	public String color;
	public int maxSpeed;
	public int price;
	
	public Car2() {
		
	}
	
	public Car2 (String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice) {
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	
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
