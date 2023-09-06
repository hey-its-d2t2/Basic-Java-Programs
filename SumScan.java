//Taking input using scanner class
import java.util.Scanner;
class SumScan{
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A = ");
		a = sc.nextInt();
		System.out.print("Enter B = ");
		b = sc.nextInt();
		System.out.print("Sum = "+(a+b));
	}
}