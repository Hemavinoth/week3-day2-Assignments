package week3day2Assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.checkerframework.checker.units.qual.Length;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
//      output= 7;
		

		
		 //* Pseudo Code: 
		// * a) Create a empty Set Using TreeSet
		 
		Set <Integer> emptyset = new TreeSet<Integer>();
		 //* b) Declare for loop iterator from 0 to data.length and add into Set 
		
		for (int i = 0; i < data.length; i++) {
			
			boolean add = emptyset.add(data[i]);
			
		}
		//conver set to list
		
		List<Integer> list = new ArrayList<Integer>(emptyset);
		
		System.out.println(list);
		
		int size = list.size();
		
		Integer integer = list.get(size-2);
		
		System.out.println(integer);
	}
}

	
		
		

	


