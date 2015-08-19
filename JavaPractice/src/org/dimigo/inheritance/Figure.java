package org.dimigo.inheritance;

public class Figure {
	private int centerX;
	private int centerY;
	
	public Figure() {
		
	}
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea() {
		return 0.0;
	}
	
	protected void printCenter() {
		System.out.println("중심좌표 : (" + this.centerX + ", " + this.centerY + ")");
	}
	
	protected void moveFigure(int x, int y) {
		centerX += x;
		centerY += y;
	}

}
