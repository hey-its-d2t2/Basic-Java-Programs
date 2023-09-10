/*
*A Java program to read N numbers using Array and calculate 
 their sum and average
 */
import java.util.Scanner;
class SumAverage
{
	public static void main(String args[])
	{
		int i,n,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		n=sc.nextInt();
		int arr[]=new int[n];
		//Input
		System.out.println("Enter "+n+" elements:");
		for(i=0;i<n;i++)
		{
			System.out.print("N"+(i+1)+"=");
			arr[i]=sc.nextInt();
		}
		//Process
		for(i=0;i<n;i++)
		{
			s=s+arr[i];
		}
		double av=(double)s/n;
		//Output
		System.out.println("The elements of array are:");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\nSum="+s);
		System.out.println("Average="+av);
	}
}