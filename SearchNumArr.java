/* Write a program to search for a number in a given array */

import java.util.Scanner;

class SearchNumArr{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter max value for array : ");
		int max = sc.nextInt();

		int[] arr = new int[max];

		System.out.println("Now,enter values one by one : ");

		for(int i =0; i<arr.length;i++)
			arr[i] = sc.nextInt();

		System.out.print("Enter number do you want to search : ");
		int sele = sc.nextInt();
 		int loc, val,cnt;
 		loc=val=cnt=0;
		for(int i =0;i<arr.length;i++)
		{
			if(sele == arr[i])
			{
				//System.out.print("Element found "+arr[i]+" at "+(i+1)+" location.");
				cnt++;
				loc = (i+1);
				val = arr[i];
				break;
			}
		} 
		if(cnt>0)
			System.out.print("Element found "+val+" at "+loc+" location.");
		else
			System.out.print("element not found");

	}
}