package org.dimigo.oop;

public class IdolGroup {
	public static void main(String[] args) {
		int cnt=0;
		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
		String[][] members = {{"GD", "태양", "대성", "탑", "승리"}, {"CL", "산다라박", "박봄", "민지"}, {"유라", "소진", "민아", "혜리", "그외"}};
		for (int i = 0; i<3; i++) {
			System.out.println("<< " + idolGroup[i] + " >>");
			for (String value : members[i]) {
				System.out.println(members[i][cnt]);
				cnt++;
			}
			cnt = 0;
			System.out.println();
		}
	}

}
