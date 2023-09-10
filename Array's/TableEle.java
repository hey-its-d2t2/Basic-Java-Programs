/* A java program to genrate the table of each array elementrs */
import java.util.Scanner;
public class TableEle{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i,n,j;
		System.out.print("Enter the size of array : ");
		n =  s.nextInt();
		int arr[] = new int[n];
		System.out.println("Now,Enter "+n+" elements of array one by one :\n");
		for(i=0;i<n;i++){
			System.out.print("N"+(i+1)+" : ");
			arr[i] = s.nextInt();
		} 
		System.out.print("The array elements are : ");
		for(i=0;i<n;i++){
			System.out.print(arr[i]);
		}
		System.out.print("\n");
		//Process to calculate the table of each elements
		for(i=0;i<n;i++){
			for(j=1;j<=10;j++){
				System.out.println(arr[i]*j);
			}
			System.out.print("\n");
		}

	}
}