package week3day2Assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="madam";
		
		String emptyname="";
		
		int length = name.length();
		
		System.out.println(length);
		
		for (int i = (length-1); i >=0; i--) {
			
			emptyname = emptyname + name.charAt(i);
			
			System.out.println(emptyname);
		}
			
			if(name.equals(emptyname))
			{
				System.out.println("its a palindrom");
			}
			
			else
			{
				System.out.println("its not a palindrom");
			}
			
		}
	}


