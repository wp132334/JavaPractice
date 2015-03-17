package org.dimigo.basic;

public class IU {

	public static void main(String[] args) {
		String name = "아이유";
		boolean gender = false;
		int age = 23;
		double hei = 161.8;
		float wei = 44.3f;
		char type = 'A';
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + name);
		if (gender) {
		System.out.println("성별 : " + "남자");
		}
		else {
		System.out.println("성별 : " + "여자");
		}
		System.out.println("나이 : " + age + " 세");
		System.out.println("키 : " + hei + " cm");
		System.out.println("몸무게 : " + wei + " kg");
		System.out.println("혈액형 : " + type + " 형");

	}

}
