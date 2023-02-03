package com.java.interview;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class StringFunctions3 {
	private static void subMethod() {
		String s = "my name is java";
		System.out.println(s);
		String[] sp = s.split(" ");
		for (int i = 0; i < sp.length; i++) {
			String[] sp1 = sp[i].split("");
			for (int j = 0; j < sp1.length; j++) {
				if(j==0) {
				String u = sp1[j].toUpperCase();
				System.out.print(u);
				}else {
				String l = sp1[j];
				System.out.print(l);
				}
			}
			System.out.print(" ");
		}
		System.out.println();
	
	}
	
	
	
	
	
	
	
	
private static void subMethod1() {
	String s = "my name is java";
	System.out.println(s);
	String[] sp = s.split(" ");
	for (int i = sp.length-1; i>=0; i--) {
		String[] sp1 = sp[i].split("");
		for (int j = 0; j<sp1.length; j++) {
			if(j==0) {
			String u = sp1[j].toUpperCase();
			System.out.print(u);
			}else {
			String l = sp1[j];
			System.out.print(l);
			}
		}
		System.out.print(" ");
	}
}
	public static void main(String[] args) {
		subMethod();
		System.out.println("*************");
		subMethod1();
	}
}
