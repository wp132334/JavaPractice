package org.dimigo.oop;

public class FamilyMember {
	private static int memberCnt=0;
	private String memberName;
	
	FamilyMember() {
		
	}
	
	FamilyMember (String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}
	
	public String getMemberName() {
		return this.memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("총 가족 인원 수 : " + FamilyMember.memberCnt + "명");
	}

}
