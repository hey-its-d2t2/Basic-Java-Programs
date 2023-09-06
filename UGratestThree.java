/*  To find greatest of three numbers by user input */
import  java.util.Scanner;

class UGratestThree{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int n2 = sc.nextInt();
		System.out.print("Enter third number : ");
		int n3 = sc.nextInt();

		System.out.print("Gratest  is : "+((n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3)));
	}
}
