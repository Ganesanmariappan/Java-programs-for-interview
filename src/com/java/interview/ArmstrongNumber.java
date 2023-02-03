package com.java.interview;

public class ArmstrongNumber {

	private static  void subMethod() {
		
		System.out.println("This Program is to check the given number is ArmStrong Number or not ");
		int a = 158;
		int temp = a;
		int r ;
		int sum = 0;
		while(a>0) {
			r = a%10;
			sum = (r*r*r)+sum;
			a=a/10;
		}
		if (temp == sum) {
			System.out.println("The given number is Armstrong :"+ temp);
		} else {
			System.out.println("The given number is not an Armstrong number :"+temp);
		}

	}
	
	public static void main(String[] args) {
		subMethod();
	}
	
}
