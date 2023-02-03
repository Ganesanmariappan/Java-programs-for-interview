package com.java.interview;

public class StringFunctions2 {
	private static void subMethod1() {
		String s = "Greens Technologies";
		String[] sp = s.split(" ");
		for (int i = sp[1].length() - 1; i >= 0; i--) {
			System.out.print(sp[1].charAt(i));

		}
		System.out.println(" " + sp[0]);
	}

	private  static void subMethod2() {
		String s = "selenium is am automation testing tool";
		String[] sp = s.split(" ");
		for (int i = sp.length-1 ; i >=0; i--) {
			
			System.out.print(sp[i] );
			if(i!=0) {
				System.out.print("*");
			}
			
		}
	}
	public static void main(String[] args) {
		subMethod1();
		subMethod2();
	}
}
