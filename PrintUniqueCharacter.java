package week3day2Assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Hemalatha";

		char[] charArray = name.toCharArray();

		System.out.println(charArray);

		Set<Character> emptyset = new LinkedHashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {

			boolean add = emptyset.add(charArray[i]);

		}
		System.out.println(emptyset);

	}

}
