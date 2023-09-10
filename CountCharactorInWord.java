/*Count the frequency of character in given String*/
import java.util.Scanner;
class CountCharactorInWord
{
	public static void main(String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any string:");
		str=sc.nextLine();
		System.out.println("The given string is : "+str);
		System.out.println("----------------------");
		for(char ch='A';ch<'Z';ch++)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(ch==str.charAt(i)-32||ch==str.charAt(i)+32)
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println(ch+" = "+count);
			}
		}
	}
}