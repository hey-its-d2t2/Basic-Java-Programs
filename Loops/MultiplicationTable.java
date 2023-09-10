/** Print the mulatiplcation table of given number */
import java.util.Scanner;
class MultiplicationTable
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		int n = sc.nextInt();
		for(int i= 1;i<=10;i++)
			System.out.println("\t"+i+" x "+n+" = "+(i*n));
	}
}