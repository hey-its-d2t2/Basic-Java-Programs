/*A java program to remove the duplicate elemets in array */
import java.util.Scanner;
public class RemoveDuplicateEle{
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		int i,j=0,k=0;
		//Input
		System.out.print("Enter the total number of elements : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Now,\nEnter the "+n+" elements one by one : ");
		for(i=0;i<n;i++){
			System.out.print("N"+(i+1)+" : ");
			arr[i] = s.nextInt();
		}
		//Output 1
		System.out.println("The Array elements are : ");
		for(i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		//Process
		for(i=0;i<n;++i){
			for(j=i+1;j<n;){
				if(arr[i] == arr[j]){
					for(int temp = j; temp<n; ++temp){
						arr[temp] = arr[temp+1];
					}
					n = n-1;		
				}		
				else
					j++;		
			}
		}
		//Output 2
		System.out.println("The Array elements after removing duplicate elements :");
		for(i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}

	}
} 