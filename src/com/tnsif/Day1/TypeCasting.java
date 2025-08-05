package com.tnsif.Day1;

public class TypeCasting {
	public static void main(String[] args) {
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		float f = 14.13f;
		double d = f;
		System.out.println(d);
		
		char ch = 'D';
		int i1 = ch;
		System.out.println(i1);
		
		char ch1 = '\u00A7';
		int i2 = ch1;
		System.out.println(i2);
		
		double d1 = 33.12f;
		long l = (long) d1;
		System.out.println(l);
		
		long l1 = 7654328765432789l;
		int i3 = (int) l1;
		System.out.println(i3);
		
		float f1 = 14.45f;
		int i4 = (int) f1;
		System.out.println(i4);
		
		byte b1 = 68;
		char ch2 = (char) b1;
		System.out.println(ch2);
		

	}
}
