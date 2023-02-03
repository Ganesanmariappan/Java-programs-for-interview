package com.java.interview;

public class SwappingOfString {

	private static void subMethod1() {
		System.out.println("swapping of string with without third variable");
		String s1 = "java";
		String s2 = "program";
		System.out.println("before swapping");
		System.out.println("s1 :" + s1);
		System.out.println("s2 :" + s2);
		s1 = s1 + s2;
		
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("after swapping");
		System.out.println("s1 :" + s1);
		System.out.println("s2 :" + s2);

	}
	private static void subMethod2() {
		System.out.println("swapping of string with third variable");
		String s1 = "java";
		String s2 ="program";
		String s3 ;
		System.out.println("before swapping ");
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		s3 = s1;
		s1 = s2;
		s2 = s3;
		System.out.println("after swapping ");
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
	}

	public static void main(String[] args) {
		subMethod1();
		subMethod2();
	}
}
