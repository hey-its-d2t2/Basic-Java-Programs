/** A java program to read a string from keyboard and count the total numbers of 
* 1 - Capital Letters
* 2 - Small Letters
* 3 - Vowel
* 4 - Consonents
* 5 - Digits
* 6-  Words
* 7 - Special characters
* */
import java.util.Scanner;
class StringAllCount
{
	public static void main(String[] args) 
	{
		String str;
		char ch;
		 int cl,sl,v,con,dig,wo,spch;
		 cl=sl=v=con=dig=wo=spch=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sting : ");
		str = sc.next();
		for(int i =0; i<= str.length();i++)
		{
			//ch = str.charAt(i);
 			for(int j = i;j<= str.length();j++)
 			{
			ch = str.charAt(i);

			if(ch >= 'A' && ch <= 'Z')
				cl++;
			else if(ch >= 'a' && ch <= 'z')
				sl++;
			else if(ch == 'a'||ch == 'e'|| ch == 'i'||ch == 'o' || ch == 'u'||ch == 'A'|| ch == 'E' || ch == 'I'|| ch == 'O'|| ch == 'U' )
				v++;
			else
				con++;
			}
		}
		System.out.print("Your ching : "+str);
		System.out.println("Capital Letters : "+cl);
		System.out.println("Small Letters : "+sl);
		System.out.println("Vowels : "+v);
		System.out.println("Consonents : "+con);
		System.out.println("Digits : "+dig);
		System.out.println("Words : "+wo);
		System.out.println("Special Charectors : "+spch);

	}
}