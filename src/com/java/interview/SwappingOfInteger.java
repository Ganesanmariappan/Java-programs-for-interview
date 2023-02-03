package com.java.interview;

public class SwappingOfInteger {

	private static void subMethod1() {
		System.out.println("swapping a number with third variable ");
		
		int a= 10;
		int b = 20;
		
		System.out.println("before swapping ");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		System.out.println("after swapping ");
		int c;
		c= a;
		a=b;
		b=c;
		System.out.println("a :" +a);
		System.out.println("b :" +b);
	}
	
	private static void subMethod2() {
		System.out.println("swapping a number without third variable");
		System.out.println("before swapping");
		int a = 10;
		int b = 20;
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
	}
	public static void main(String[] args) {
		subMethod1();
		subMethod2();
	}

}
