/* A Java Prrogram to Find the sum of n(last digit) digit */
import java.util.Scanner;
public class SumNnum{
	public static void main(String[] args) {
		float n,sum = 0;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter last digit : ");
		n =s.nextFloat();
		for(int i = 1;i <= n;i++){
			sum += i;
		}
		System.out.print("Sum = "+sum);
	}
}