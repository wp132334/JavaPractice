package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args) {
		int i1 = 1700000;
		int i2 = 3;
		int i3 = 1500;
		long l = (long)i1*i2*i3*12;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", i1) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d", i2) + "명");
		System.out.println("점포 수 : " + String.format("%,d", i3) + "개");
		System.out.println("연간 인건비 : " + String.format("%,d", l) + "원");
	}
}
