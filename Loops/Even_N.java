/** A java program to print all even upto N*/
import java.util.Scanner;
class Even_N
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.print(" "+i);
		}		
	}
}