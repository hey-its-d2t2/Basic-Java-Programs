/* a java program to find the GCD of two numbers input using console class methoad */
import java.io.*;
public class GCD{
	public static void main(String[] ags){
		Console cin = System.console();
		int gcd = 0;
		int a = Integer.parseInt(cin.readLine("A = "));
		int b = Integer.parseInt(cin.readLine("B = "));
		/*
		 for(int i = 1;i <= a && i <=b ;i++){
			if(a % i == 0 && b % i == 0){
				gcd = i; 
			}
		}
		System.out.print("The GCD of "+a+" and "+b+" is : "+gcd);
		*/
		// Using while loop
		while(b != 0){
			int temp = b;
			b = a % b;
			a = temp;
		}
		gcd = a;
		System.out.print("The GCD is : "+gcd);

	}
}