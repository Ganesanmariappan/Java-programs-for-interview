package Pyramid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Concept {

	public static void main(String[] args) {

		Integer[] a= {10,20,40,50};
		
		List<Integer> li=new ArrayList<Integer>(Arrays.asList(a));
		
		ListIterator<Integer> itr = li.listIterator();
		
		while (itr.hasNext()) {
			Integer value = itr.next();
			
			if (value==50) {
				itr.remove();
				itr.add(1000);
			}
		}
		System.out.println(li);
		
		while (itr.hasPrevious()) {
			Integer value = itr.previous();
			
			if (value==40) {
				itr.remove();
				itr.add(4000);
			}
		}
		System.out.println(li);
	}
}
