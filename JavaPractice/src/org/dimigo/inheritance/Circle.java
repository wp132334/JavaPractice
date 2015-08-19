package org.dimigo.inheritance;

public class Circle extends Figure {
	
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public Circle(int centerX, int centerY, int radius) {
		super(centerX,centerY);
		this.radius = radius;
	}
	
	protected double calcArea() {
		return (radius * radius * Math.PI);
	}
	
	protected void printCenter() {
		System.out.print("원 ");
		super.printCenter();
		//System.out.println("원 중심좌표 : (" + centerX + ", " + centerY + ")");
	}

}
