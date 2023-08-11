package week3day2Assignments;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {

		// Declare a String array and add the Strings values as
		// (Google,Microsoft,TestLeaf,Maverick)

		String[] values = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		int length = values.length;

		Arrays.sort(values);

		// Iterate it in the reverse order

		for (int j = length - 1; j >= 0; j--) {

			System.out.println(values[j] );

			

		}
		

	}

}
