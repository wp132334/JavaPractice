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
		
		System.out.println("<< ���� ���� �� >>");
		System.out.println("��ٸ��� ���� : " + first);
		System.out.println("����纯�� ���� : " + second);
		
		if (first > second) {
			System.out.println("��ٸ����� ����纯������ " + (first-second) + "�� Ů�ϴ�");
		}
		if (first < second) {
			System.out.println("����纯���� ��ٸ��ú��� " + (second-first) + "�� Ů�ϴ�");
		}
	}

}
