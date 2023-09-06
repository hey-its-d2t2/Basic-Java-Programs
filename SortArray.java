/*Write a program to sort an array of numbers using any sorting 
technique */
import java.util.Scanner;

class SortArray{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter max value for array : ");
		int max = sc.nextInt();

		int arr[] = new int[max];

		System.out.println("Enter elements one by one : ");
		for(int i =0;i<arr.length;i++)
			arr[i] = sc.nextInt();

		//sorting -> Bubble Sort

		int  temp =0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j =0;j<arr.length-1-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		System.out.println("Array after sorting : ");
		for(int i= 0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}
}
