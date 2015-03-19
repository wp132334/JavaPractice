package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		int firstlow = 10;
		int firsthigh = 9;
		double firsthei = 5.8;
		
		int secondlow = 9;
		double secondhei = 5.4;
		
		double first = (firstlow + firsthigh) * firsthei / 2;
		double second = secondlow * secondhei;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + first);
		System.out.println("평행사변형 넓이 : " + second);
		
		if (first > second) {
			System.out.println("사다리꼴이 평행사변형보다 " + (first-second) + "더 큽니다");
		}
		if (first < second) {
			System.out.println("평행사변형이 사다리꼴보다 " + (second-first) + "더 큽니다");
		}
	}

}
