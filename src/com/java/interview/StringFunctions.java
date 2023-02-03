package com.java.interview;

public class StringFunctions {

	private static void submethod1() {
		String s = "java";
		String s1 = "java";
		String s2 = new String("java");
		boolean e = s.equals(s1);
		System.out.print("It compare the value present in the string :");
		System.out.println(e);
		System.out.println(s1.equals(s2));
		System.out.print("It compare the memory location : ");
		System.out.println(s==s1);
		System.out.println(s==s2);
	}
	
	private static void subMethod2() {
		String s = "Greens Technologies";
		String[] sp = s.split(" ");
		System.out.println(sp[1]);
	}
	private static void subMethod3() {
		System.out.println("It Compares in ASCII Values ");
		String s = "java";
		String s1 = "Java";	
		String s2 = "java";
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareToIgnoreCase(s1));
		
	}
	
	public static void main(String[] args) {
		submethod1();
		subMethod2();
		subMethod3();
	}
}
