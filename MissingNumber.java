package week3day2Assignments;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 1, 2, 3, 3, 8, 6, 7, 5, 4, 4, 2, 1, 5, 6, 10 };

		int nextNumber = 0;

		Set<Integer> set = new TreeSet<Integer>();

		for (int i = 0; i < input.length; i++) {

			boolean add = set.add(input[i]);

		}
		
		List<Integer> ascorder = new ArrayList<Integer>(set);
		
		System.out.println(ascorder);
		
		for (int j = 0; j < ascorder.size(); j++) {
			
			if(ascorder.get(j)==nextNumber+1)
			{
				nextNumber=nextNumber+1;
			}
			
			else
				System.out.println("The missing Number is "+" "+ (nextNumber+1));
			
			
		}
		

	}}