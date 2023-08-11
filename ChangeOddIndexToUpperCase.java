package week3day2Assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";

		char[] charArray = test.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (i % 2 == 1) {
				
				char upperCase = Character.toUpperCase(charArray[i]);
				
				String valueOf = String.valueOf(upperCase);
				
				System.out.print(valueOf);

			} else
				System.out.print(Character.toLowerCase(charArray[i]));

		}

	}

}
