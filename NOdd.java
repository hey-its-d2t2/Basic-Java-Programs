/* Write a program to print first 'n' odd numbers, take the value of 'n' 
from user */
import java.util.Scanner;

class NOdd{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value for n : ");
		int n = sc.nextInt();
		int o =1;
		for(int i =1 ;i<=n;i++){
			System.out.println(o);
			o+=2;
		}
	}
}