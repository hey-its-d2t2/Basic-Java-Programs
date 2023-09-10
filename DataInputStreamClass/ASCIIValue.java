/** A java program to print the ASCII value of a charecter 
*input - DataInputStream class
*@author - DEEPAK SINGH
*/
import java.io.DataInputStream;
import java.io.IOException;
class ASCIIValue
{
	public static void main(String[] args) throws IOException
	{
		DataInputStream din = new DataInputStream(System.in);
		System.out.print("Enter a charector : ");
		char ch = Character.parseChar(din.readLine());
		System.out.print("ASCII value of '"+ch+"' is "+(int)ch);
	}
}