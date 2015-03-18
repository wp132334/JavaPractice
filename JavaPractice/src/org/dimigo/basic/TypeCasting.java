package org.dimigo.basic;

public class TypeCasting {
	public static void main(String[] args) {
		byte b = 10;
		short s = b;
		int i = s;
		long l = i;
		
		System.out.println(b + ", " + s + ", " + i + ", " + l);
		
		long l1 = 100;
		int i1 = (int) l1;
		short s1 = (short) i1;
		byte b1 = (byte) s1;
		
		System.out.println(b1 + ", " + s1 + ", " + i1 + ", " + l1);
	}

}
