package com.java.interview;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayFunctions {
	static int index;

	private static void subMethod() {
		String[] a = { "india", "nepal", "srilanka", "INDIA" };

		List<String> l = new LinkedList<>();
		for (int i = 0; i < a.length; i++) {
			String str = a[i].toLowerCase();
			l.add(str);
			for (int j =0+1; j < l.size(); j++) {
				String string = l.get(j);
				if (l.get(i).equals(string)) {
					index = j;

				}
			}

		}

		System.out.println(index);

		System.out.println(l);
		Set<String> s = new LinkedHashSet<>();
		s.addAll(l);
		System.out.println(s);

	}

	public static void main(String[] args) {
		subMethod();
	}

}
