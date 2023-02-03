package com.java.interview;

public class StringFunctions4 {

	private static void subMethod1() {

		System.out.println("count the number of characters in a string without using length method");

		String s = "count the number of characters in the string";

		int c = 0;

		char[] ch = s.toCharArray();

		for (char cha : ch) {

			c++;

		}
		System.out.println("the length of the string : " + c);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	private static void subMethod2() {

		System.out.println("check the string rotation");
		
		String s1 = "abcd";
		
		String s2 = "cdab";
		
		String s3 = s1+s2;
		if (s1.length()!=s2.length()) {
			System.out.println("s2 is not the rotation of s1");
		}
		if (s3.contains(s2)) {
			System.out.println("s2 is the rotation of s1");
		} else {
			System.out.println("s2 is the rotation of s1");
		}
		
	}
	public static void main(String[] args) {
		subMethod1();
		subMethod2();
	}

}
