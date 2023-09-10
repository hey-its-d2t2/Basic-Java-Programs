/* A java program to find and replace the given element in array */
import java.util.Scanner;
public class FindEle{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int i,ele,rep;
		System.out.print("Eter the size of array : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Now,\nEnter "+n+" elements one by one :");
		for(i=0;i<n;i++){
			System.out.print("N"+(i+1)+" : ");
			arr[i] = s.nextInt();
		}
		System.out.print("The given array elements are : ");
		for(i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}//Process of Finding and Repleacing The Element
		System.out.print("\nEnter the element which you want to find : ");
		ele = s.nextInt();
		for(i=0;i<n;i++){
			if(arr[i]==ele)
				System.out.println("Element found at "+(i+1)+"th position.");
		}
		System.out.println("Element not found.");
	}
}