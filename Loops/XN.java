/** Java program to calculate x^n using for loop. (Without using pow() function).*/
 import java.util.Scanner;
 class XN
 {
 	public static void main(String[] args)
 	{
 		int x, n,res = 1;
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter base : ");
 		x = sc.nextInt();
 		System.out.print("Enter power : ");
 		n = sc.nextInt();	
 		for(int i= 1;i<=n;i++)
 			res*=x;
        System.out.println("Result = "+res);
 	}
 }