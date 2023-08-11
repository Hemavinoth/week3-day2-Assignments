package week3day2Assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "PayPal";

		char[] charArray = string.toCharArray();

		System.out.println(charArray);

		Set<Character> charset = new LinkedHashSet<Character>();

		Set<Character> dupcharset = new LinkedHashSet<Character>();

		for (Character character : charArray) {

			if (!charset.add(character)) {
				dupcharset.add(character);

			}

		}
		System.out.println(charset);

		System.out.println(dupcharset);

		for (Character character1 : charset) {

			if (character1 != ' ') {
				System.out.print(character1);
			}
		}

	}

}
