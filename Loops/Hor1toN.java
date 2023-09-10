/** A java program to print 1 to N horizontally */
import java.util.Scanner;
class Hor1toN
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
			System.out.println(i);
		
	}
}