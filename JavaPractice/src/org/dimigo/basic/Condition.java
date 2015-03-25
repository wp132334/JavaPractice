package org.dimigo.basic;

/**
 * << 네번째 실습과제 >>
 * 
 * 고속도로 통행료를 계산하여 출력해보기
 *
 * 1. 기본요금 - 고속버스 : 850원, 경차 : 300원, 그 외 : 600원
 * 2. 10km 초과 시마다 고속버스는 300원씩 추가, 경차와 그 외는 200원씩 추가
 * 예) 고속버스로 10km 주행 : 850원, ~20km 주행 : 1150원, ~30km : 1450원  
 *       경차로 10km 주행 : 300원, ~20km 주행 : 500원,  ~30km : 700원
 *
 * @author teacher
 *
 */
public class Condition {

	public static void main(String[] args) {
		int dis = 10;
		String car = "경차";
		int sum=0;
		switch (car) {
		case "고속버스":
			sum = 850;
			break;
		case "경차":
			sum = 300;
			break;
		case "그 외":
			sum = 600;
			break;
		}
		switch (car) {
		case "고속버스":
			if (dis % 10 != 0)
				sum = sum + 300 * (dis/10);
			else
				sum = sum + 300 * (dis/10-1);  
		default:
			if (dis % 10 != 0)
				sum = sum + 200 * (dis/10);
			else
				sum = sum + 200 * (dis/10-1);
		}
/*		if (dis <= 10) {
			switch (car) {
			case "고속버스":
				sum = sum + 300;
			default:
				sum = sum + 200;
			}
		}
		else if (dis > 10 && dis <= 20) {
			switch (car) {
			case "고속버스":
				sum = sum + 300 * 2;
			default:
				sum = sum + 200 * 2;
			}
		}
		else if (dis > 20 && dis <= 30) {
			switch (car) {
			case "고속버스":
				sum = sum + 300 * 3;
			default:
				sum = sum + 200 * 3;
			}
		}
		*/
		System.out.println("<<고속도로 통행료 계산>>");
		System.out.println("거리 : " + dis + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + sum + "원");
	}
	

}
