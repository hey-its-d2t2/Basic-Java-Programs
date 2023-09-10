/* A java program  to perform the multiplicatio using repetetive subtraction thrugh command line argument */
import java.io.*;
public class MulRepSub{
public static void main(String[] args) {
	Console cin = System.console();
	int n1 = Integer.parseInt(cin.readLine("Enter First Number : "));
	int n2 = Integer.parseInt(cin.readLine("Enter Secoand Number : "));
	int c,d=0;
	for(c = 1;c <= n2;c++){
		d = d-(-n1);
	}
	System.out.print("The multiplication of "+n1+" and "+n2+" is : "+d);
}
}
