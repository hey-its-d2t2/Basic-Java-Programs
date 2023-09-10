/** A java program to print 1 to N vertically */
import java.util.Scanner;
class Ver1toN
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
			System.out.print(" "+i);		
	}
}