package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer;
		
		System.out.println("팀 포트리스의 병과는 몇 개인가?");
		answer = scanner.nextLine();
		if (answer.equals("9")) {
			System.out.println("정답입니다");
		}
		else {
			System.out.println("틀렸습니다");
		}
		
		System.out.println("유희왕에서 유우기의 에이스 카드는 무엇인가?");
		answer = scanner.nextLine();
		if (answer.equals("블랙 매지션")) {
			System.out.println("정답입니다");
		}
		else {
			System.out.println("틀렸습니다");
		}
		
		System.out.println("유희왕에서 주인공들의 에이스 몬스터의 공격력은 얼마인가?");
		answer = scanner.nextLine();
		if (answer.equals("2500")) {
			System.out.println("정답입니다");
		}
		else {
			System.out.println("틀렸습니다");
		}
	}
}
