package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args) {
		int i1 = 1700000;
		int i2 = 3;
		int i3 = 1500;
		long l = (long)i1*i2*i3*12;
		
		System.out.println("<< ��̺��� ���� �ΰǺ� >>");
		System.out.println("�� ��� �޿� : " + String.format("%,d", i1) + "��");
		System.out.println("���� �� ���� �� : " + String.format("%,d", i2) + "��");
		System.out.println("���� �� : " + String.format("%,d", i3) + "��");
		System.out.println("���� �ΰǺ� : " + String.format("%,d", l) + "��");
	}
}
