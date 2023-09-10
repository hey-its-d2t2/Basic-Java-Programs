import java.util.Scanner;
public class Sum{
	public static void main(String[] args) {
	int a,b;
	Scanner s = new Scanner(System.in);
	System.out.print("Please Enter A Number : ");
	a = s.nextInt();
	System.out.println("Enter Secoand Number : ");
	b = s.nextInt();
	System.out.println("Sum = "+(a+b));
	}
}