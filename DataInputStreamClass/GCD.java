/** A java program to count the GCD of two numcers using while loop
 * Input -  DataInputStream class
 * @Author - DEEPAK KUMAR, RollNo - 92, SEM - III
**/
import java.io.*;
class GCD{
	public static void main(String[] args) throws IOException {
		int a,b,gcd = 0, temp;
		DataInputStream din = new DataInputStream(System.in);
		System.out.print("A = ");
		a = Integer.parseInt(din.readLine());
		System.out.print("B = ");
		b = Integer.parseInt(din.readLine());
		while(b != 0){
			temp = b;
			b = a%b;
			a = temp;
		}
		gcd = a;
		System.out.print("The GCD  is = "+gcd);
		
	}
}