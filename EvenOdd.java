/* Write a program for checking if the given number is even or odd */
import java.util.Scanner;

class EvenOdd{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		System.out.print((n%2==0)?"Even":"Odd");
	}
}