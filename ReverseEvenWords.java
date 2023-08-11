package week3day2Assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester";
		String[] t = test.split(" ");

		int length = t.length;

		System.out.println(length);

		String val = "";
		
		for (int i = 0; i < t.length; i++) 	{

			if (i % 2 !=0)
			{
				char[] charArray = t[i].toCharArray();
				
				for (int j = charArray.length-1; j >=0 ; j--) {
					
					val = val + charArray[j];
					
				}
				
				System.out.print(val + " ");
			}
			else
			{
				System.out.print(t[i]+ " ");
			}

					
				}
				

	}

}
