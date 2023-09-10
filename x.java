/**A java program that takes a word from the user as input and converts it to morse code with using iterative statement(while loop) 
 * and print the screen with a space between each morse code. Your program will stop when it see '!' character.
* Input :     Hello !
* Output :    .... . .-.. .-.. --- 
*/
import java.io.IOException;
import java.util.Scanner;
class WordToMorceCode
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		String word;
		int i = 0;
		char ch = 0;
		System.out.print("Type a word : ");
		word = sc.next();
		while(ch != '!')
		{ 
			ch = word.charAt(i);
			if(ch =='A'||ch =='a')
				System.out.println(" .- ");
			else if(ch == 'B'|| ch == 'b')
				System.out.println(" -...");
			else if(ch == 'C'||ch =='c')
				System.out.println(" -.-.");
			else if(ch == 'D'|| ch == 'd')
				System.out.println(" -..");
			else if(ch == 'E'||ch == 'e')
				System.out.print(" .");
			else if(ch == 'F'||ch == 'f')
				System.out.println(" ..-.");
			else if(ch == 'G'||ch == 'g')
				System.out.println(" --.");
			else if(ch == 'H'||ch =='h')
				System.out.println(" ....");
			else if(ch == 'I'||ch == 'i')
				System.out.println(" ..");
			else if (ch == 'J'||ch =='j')
				System.out.println(" .---");
			else if(ch == 'K'||ch =='k')
				System.out.println(" -.-");
			else if(ch == 'L'||ch == 'l')
				System.out.println(" .-..");
			else if(ch == 'M'|| ch == 'm')
				System.out.println(" --");
			else if (ch == 'N'||ch =='n')
				System.out.println(" -.");
			else if(ch =='O'||ch == 'o')
				System.out.println(" ---");
			else if(ch == 'P'||ch == 'p')
				System.out.println(" .--.");
			else if (ch == 'Q'||ch == 'q')
				System.out.println(" --.-");
			else if (ch == 'R'||ch == 'r')
				System.out.println(" .-.");
			else if(ch == 'S'||ch == 's')
				System.out.println(" ...");
			else if(ch == 'T'||ch == 't')
				System.out.println(" -");
			else if(ch == 'U'||ch == 'u')
				System.out.println(" ..-");
			else if (ch == 'V'|| ch == 'v')
				System.out.println(" ...-");
			else if(ch == 'W'|| ch == 'w')
				System.out.println(" .--");
			else if(ch == 'X'||ch =='x')
				System.out.println(" -..-");
			else if(ch == 'Y'|| ch == 'y')
				System.out.println(" -.--");
			else if(ch == 'Z'|| ch =='z')
				System.out.print(" --.");
			else
				System.out.println("Wrong input !");
			i++;
		}
	}
}
