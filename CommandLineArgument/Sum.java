/* A java program of addition of two numbers using command line argument*/
import java.util.*;
public class Sum{
	public static void main(String[] args) {
		// System.out.print("A = ");
		int a = Integer.parseInt(args[0]);
		// System.out.print("B = ");
		int b = Integer.parseInt(args[1]);
		System.out.print("Sum = "+(a+b));
	}
}