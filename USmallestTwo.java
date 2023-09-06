/*  To find smaller of two numbers by user input */
import java.util.Scanner;

class USmallestTwo{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int n2 =sc.nextInt();

		System.out.print("Smallest is : "+((n1<n2)?n1:n2));
	}
}
