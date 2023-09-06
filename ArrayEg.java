import java.util.Scanner;
class ArrayEg
{
	public static void main(String[] args) 
	{
		int arr[];
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("N=");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Now, enter "+n+" elements one by one:");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The elements of array are:");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
}