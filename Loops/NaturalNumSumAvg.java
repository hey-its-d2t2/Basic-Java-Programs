/** Java progrma to find the sum and average of all natural numbers up to N. */
import java.util.Scanner;
class NaturalNumSumAvg
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		int n = sc.nextInt();
		int sum= 0,avg=0;
		for(int i=1;i<=n;i++)
		{
			sum += i; 
		}
		avg = sum/n;
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+avg);
	}
}