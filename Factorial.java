/*Write a program to print factorial of a given number*/

import java.util.Scanner;

class Factorial{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number : ");
		int num = sc.nextInt();

		if(num <0){
			System.out.print("Number should be non-negative.");
			return;
		}

		// long fact = 1;
		// for(int i =1;i<=num;i++)
		// 	fact *= i;
		// System.out.print("Factorial of "+num+ " is : "+fact);

		long fact = calcFactorial(num);
		System.out.print("Factorial of "+num+" is : "+fact);
	}
	public static long  calcFactorial(long num)
	{
		
		if(num ==0 || num ==1)
			return 1;

		return num *calcFactorial(num-1);
	}
}