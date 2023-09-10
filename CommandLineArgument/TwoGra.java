/* A java program for find the largest number between two numbers using command line argument */
import java.util.*;
public class TwoGra{
	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		// if(n1>n2)
		// 	System.out.print("Grater digit is N1 : "+args[0]);
		// else
		// 	System.out.print("Grater digit is N2 : "+args[1]);
		int res = (n1>n2)?n1:n2;
		System.out.print("THe Grater Digit is : "+res);
	}
}