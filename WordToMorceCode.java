/**A java program that takes a word from the user as input and converts it to morce code with using iterative statment(while loop) 
 * and print the screen with a space between each morce code. Your program will stop when it see '!' character.
* Input : Hello !
* Output : .... . .-.. .-.. --- 
* --------------------------------
* Morce Code is code for translating letters to dots(.) and dashes(-). These represents a short and long signal duration.
* Samuel Morce devloped the code in the 1830's to send message throw the telegraph machine. The alphabet morce codeis :  
+--------------------------------------------------------------+
| A = .-				* J = .---			* S = ...			|
| B = -...				* K = -.-			* T = -				|
| C = -.-.				* L = .-..			* U = ..-			|
| D = -..				* M = --			* V = ...-			|
| E = .					* N = -.			* W = .--			|
| F = ..-.				* O = ---			* X = -..-			|
| G = --.				* P = .--.			* Y = -.--			|
| H = ....				* Q = --.-			* Z = --.			|
| I = ..				* R = .-.								|
+--------------------------------------------------------------+
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
			System.out.print(" .- ");
			else if(ch == 'B'|| ch == 'b')
				System.out.print(" -...");
			else if(ch == 'C'||ch =='c')
				System.out.print(" -.-.");
			else if(ch == 'D'|| ch == 'd')
				System.out.print(" -..");
			else if(ch == 'E'||ch == 'e')
				System.out.print(" .");
			else if(ch == 'F'||ch == 'f')
				System.out.print(" ..-.");
			else if(ch == 'G'||ch == 'g')
				System.out.print(" --.");
			else if(ch == 'H'||ch =='h')
				System.out.print(" ....");
			else if(ch == 'I'||ch == 'i')
				System.out.print(" ..");
			else if (ch == 'J'||ch =='j')
				System.out.print(" .---");
			else if(ch == 'K'||ch =='k')
				System.out.print(" -.-");
			else if(ch == 'L'||ch == 'l')
				System.out.print(" .-..");
			else if(ch == 'M'|| ch == 'm')
				System.out.print(" --");
			else if (ch == 'N'||ch =='n')
				System.out.print(" -.");
			else if(ch =='O'||ch == 'o')
				System.out.print(" ---");
			else if(ch == 'P'||ch == 'p')
				System.out.print(" .--.");
			else if (ch == 'Q'||ch == 'q')
				System.out.print(" --.-");
			else if (ch == 'R'||ch == 'r')
				System.out.print(" .-.");
			else if(ch == 'S'||ch == 's')
				System.out.print(" ...");
			else if(ch == 'T'||ch == 't')
				System.out.print(" -");
			else if(ch == 'U'||ch == 'u')
				System.out.print(" ..-");
			else if (ch == 'V'|| ch == 'v')
				System.out.print(" ...-");
			else if(ch == 'W'|| ch == 'w')
				System.out.print(" .--");
			else if(ch == 'X'||ch =='x')
				System.out.print(" -..-");
			else if(ch == 'Y'|| ch == 'y')
				System.out.print(" -.--");
			else if(ch == 'Z'|| ch =='z')
				System.out.print(" --.");
			else
				System.out.println("Wrong input !");
			i++;
		}
		int len  = word.length();
		try 
		{
			word.charAt(len);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.print("");
		}
	}
}