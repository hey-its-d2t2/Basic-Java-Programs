/* Write a program to add all the numbers in a given array */

import java.util.Scanner;

class AddEleArray{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter max value for array : ");
		int max = sc.nextInt();

		int []arr = new int[max];

		System.out.println("Now,enter array elenents one by one : ");
		for(int i=0; i<arr.length;i++)
			arr[i] = sc.nextInt();

		int sum = 0;

		for (int i =0;i<arr.length ;i++ )
			sum += arr[i];

		System.out.print("Sum of elements : "+sum);
	}
}
