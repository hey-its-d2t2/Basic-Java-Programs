/**A java program that takes a latin letter from the user as input and converts it to morce code with using conditional statment(if/then/else)and print your result on your screen 
* Input : A 
* Output : .-
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
import java.util.Scanner;
class LatinToMorceCode
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.print("Enter a latin letter : ");
		ch = sc.next().charAt(0);
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
		}
}