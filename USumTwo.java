/*  To find sum of two numbers by user input */
import java.util.Scanner;

class USumTwo{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("A = ");
		int a = sc.nextInt();
		System.out.print("B = ");
		int b = sc.nextInt();

		System.out.print("Sum = "+(a+b));
	}
}