package org.dimigo.inheritance;

public class Rectangle extends Figure {
	
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX,centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return (width * height);
	}
	
	protected void printCenter() {
		System.out.print("사각형 ");
		super.printCenter();
		//System.out.println("사각형 중심좌표 : (" + centerX + ", " + centerY + ")");
	}

}
