package week3day2Assignments;


import java.util.LinkedHashSet;

import java.util.Set;


public class RemoveDuplicatesWords {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String[] split = text.split(" ");
		
		for (int j = 0; j < split.length; j++) {
			
			System.out.println(split[j]);
			
		}

		Set<String> emptyset = new LinkedHashSet<String>();

		for (int i = 0; i < split.length; i++) {

			boolean add = emptyset.add(split[i]);

		}
		System.out.println(emptyset);
	}
}
