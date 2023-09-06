//Input Using Console Class
import java.io.*;
class SumCon{
	public static void main(String[] args) {
		int a,b;
		Console cin = System.console();
		System.out.print("A = ");
		a = Integer.parseInt(cin.readLine());
		System.out.print("B = ");
		b = Integer.parseInt(cin.readLine());
		System.out.print("Sum = "+(a+b));
	}
}