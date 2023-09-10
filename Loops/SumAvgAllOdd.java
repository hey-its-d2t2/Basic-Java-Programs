/** Find the sum and average of all odd numbers up to N. */
import java.util.Scanner;
class SumAvgAllOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		int n = sc.nextInt();
		int sum = 0,avg = 0;
		for(int i= 1;i<=n;i++)
		{
			if(i%2 != 0)
				sum += i;
		}
		System.out.println("Sum = "+sum);
		System.out.print("Average = "+(sum/n));
	}
}