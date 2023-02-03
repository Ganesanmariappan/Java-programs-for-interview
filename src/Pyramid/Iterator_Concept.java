package Pyramid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator_Concept {
	
	public static void main(String[] args) {
		
		Integer[] a= {10,20,40,50};
		
		List<Integer> li=new ArrayList<Integer>(Arrays.asList(a));
		
		Iterator<Integer> itr = li.iterator();
		
		while (itr.hasNext()) {
			Integer value = itr.next();
			if(value==40) {
			itr.remove();
			}
		}
		
		System.out.println(li);
	}

}
