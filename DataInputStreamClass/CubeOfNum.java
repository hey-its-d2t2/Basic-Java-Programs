/** A java program to find the cubes of a given number.
 * input - DataInputStream Class
 * @author - DEEPAK SINGH
 */
import java.io.DataInputStream;
import java.io.IOException;
class CubeOfNum
{
	public static void main(String[] args) throws IOException
	{

		DataInputStream din = new DataInputStream(System.in);
		System.out.print("Enter a number : ");
		double n = Double.parseDouble(din.readLine());
		double c = Math.pow(n,3);
		System.out.print("The cube of "+(int)n+" is :"+(int)c);
		
	}
}
