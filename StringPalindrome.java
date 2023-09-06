/* Find if a string is palindeome using string class in java */

import java.util.Scanner;

class StringPalindrome
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string : ");
		String input = sc.nextLine();

		boolean isPalindrome = checkPalindrome(input);

		if(isPalindrome)
			System.out.print("The given sting is a palindrome.");
		else
			System.out.print("The given string is not a palindrome.");
		sc.close();
	}

	public static boolean checkPalindrome(String str)
	{
		 String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
	}
}