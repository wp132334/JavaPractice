package org.dimigo.oop;

import java.util.Scanner;

public class Score {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.print("수학 점수 입력 => ");
		int mat = scanner.nextInt();
		System.out.print("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		System.out.println("<< 점수 출력 >>");
		String sb1 = new StringBuilder().append("국어 점수 : ").append(kor).append("점").toString();
		System.out.println(sb1);
		String sb2 = new StringBuilder().append("수학 점수 : ").append(mat).append("점").toString();
		System.out.println(sb2);
		String sb3 = new StringBuilder().append("영어 점수 : ").append(eng).append("점").toString();
		System.out.println(sb3);
		int sum = kor + mat + eng;
		double div = sum / 3.0;
		String sb4 = new StringBuilder().append("총점 : ").append(sum).append("점").toString();
		System.out.println(sb4);
		String sb5 = new StringBuilder().append("평균 : ").append(String.format("%.1f", div)).append("점").toString();
		System.out.println(sb5);
	}

}
