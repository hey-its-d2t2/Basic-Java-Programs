/* A java program to find the sum of two digits */
import java.util.Scanner;
public class Sum{
	public static void main(String[] args){
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Number :");
	a=sc.nextInt();
	System.out.println("Enter Secoand Number :");
	b=sc.nextInt();
	c=a+b;
	System.out.println("Sum="+c);
	}
}