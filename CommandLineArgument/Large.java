//WAP in java to read two  number through command line arguments and print the largest number
import java.util.*;
public class Large{
	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);ph
		int res = (n1>n2)?n1:n2;
		System.out.print("The Grater Digit is : "+res);
	}
}