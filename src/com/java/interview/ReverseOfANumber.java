package com.java.interview;

public class ReverseOfANumber {
	static int a = 123;
	static int temp = a;
	static int reverse = 0;
	static int b = -123; //-321
	static int temp1 = b;
	static int reverse1 = 0;

	private static void positive() {
		while (a > 0) { // 123 12 1
			int remainder = a % 10; // 3 2 1
			reverse = reverse * 10 + remainder; // 3 32 321
			a = a / 10; // 12 1 0.1
		}

		System.out.println("the given number :" + temp);
		System.out.println("the reverse of a number :" + reverse);

	}

	private static void negative() {
		System.out.println("the given number :" + temp1);
		if(b<0) {
			System.out.print("-");
			b=b*-1; // 123
		}
		
		while (b> 0) { // 123 12 1
			int remainder = b % 10; // 3 2 1
			reverse1 = reverse1 * 10 + remainder; // 3 32 321
			b= b / 10; // 12 1 0.1
		}

		
		System.out.println(reverse1);
		
		
	}

	public static void main(String[] args) {
		positive();
		negative();
	}

}
