/**Example of Single Dimensional Array*/
import java.util.Scanner;
class ArrayEg2
{
	public static void main(String[] args) 
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("N=");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Now, enter "+n+" elements one by one:");
		for(i=0;i<n;i++)
		{
			System.out.print("N"+(i+1)+"=");
			a[i]=sc.nextInt();
		}
		System.out.println("The elements of array are:");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
	}
}