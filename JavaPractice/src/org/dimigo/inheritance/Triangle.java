package org.dimigo.inheritance;

public class Triangle extends Figure {
	
	private int width;
	private int height;
	
	public Triangle() {
		
	}
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return ((width * height) / 2);
	}
	
	protected void printCenter() {
		System.out.print("삼각형 ");
		super.printCenter();
		//System.out.println("삼각형 중심좌표 : (" + super.centerX + ", " + centerY + ")");
	}

}
