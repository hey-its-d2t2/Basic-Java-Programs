/* Write a program to create an array of numbers by taking the numbers 
from user as input and print the array */

import java.util.Scanner;

class UserArray{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter max value for array : ");
		int max = sc.nextInt();

		int arr[] = new int[max];

		System.out.println("Now, enter values one by one : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Array elements are : ");
		for(int i=0; i< arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}