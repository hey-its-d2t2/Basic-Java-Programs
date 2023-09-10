/** Java program to find the factorial of a given number.*/
 import java.util.Scanner;
 class Factorial
 {
 	public static void main(String[] args)
 	{
 		int fact = 1,n;
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter  a number : ");
 		n = sc.nextInt();
 		for(int i= 1;i<=n;i++)
 			fact*=i;
        System.out.println("Factorial = "+fact);
 	}
 }