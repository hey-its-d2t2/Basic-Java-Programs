/*Find the locations and count of occurrences of a character in a 
string */

import java.util.Scanner;

class StringOccr
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string : ");
		String str = sc.nextLine();

		System.out.print("Enter a character : ");
		char ch = sc.next().charAt(0);

		int count = 0;

		System.out.println("Locations of occurrences : ");

		for(int i =0; i<str.length();i++)
		{
			if(str.charAt(i) == ch)
			{
				System.out.println("Index " + i);
                count++;
			}
		}

		if (count > 0) 
            System.out.println("The character '" + ch + "' occurs " + count + " time(s) in the string.");
        else 
            System.out.println("The character '" + ch + "' does not occur in the string.");
        

	}
}