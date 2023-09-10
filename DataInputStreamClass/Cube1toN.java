/** A java program to find the cube of 1 to n numbers .
 * input- DataInputStream class
 * @author - DEEPAK SINGH
 */
 import java.io.DataInputStream;
 import java.io.IOException;
 class Cube1toN
 {
 	public static void main(String[] args) throws IOException
 	{
 		DataInputStream din = new DataInputStream(System.in);
 		System.out.println("This program calculates the cube of 1 to n th digits.");
 		System.out.print("Enter n th number : ");
 		double n = Double.parseDouble(din.readLine());
 		double i = 1,c = 0;
 		do
 		{
 			c = Math.pow(i,3);
 			//System.out.println((int)i+"\t--------\t"+(int)c);
 			System.out.printf("%5f ---- %30f \n",i,c);
 			i++;
 		}while(i<=n);
 	}
 }