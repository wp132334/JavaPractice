package org.dimigo.basic;

public class IU {

	public static void main(String[] args) {
		String name = "������";
		boolean gender = false;
		int age = 23;
		double hei = 161.8;
		float wei = 44.3f;
		char type = 'A';
		
		System.out.println("<< ������ ������ >>");
		System.out.println("�̸� : " + name);
		if (gender) {
		System.out.println("���� : " + "����");
		}
		else {
		System.out.println("���� : " + "����");
		}
		System.out.println("���� : " + age + " ��");
		System.out.println("Ű : " + hei + " cm");
		System.out.println("������ : " + wei + " kg");
		System.out.println("������ : " + type + " ��");

	}

}
