/** Java program to find the sum  of a given Integer.*/
 import java.util.Scanner;
 class SumInteger
 {
 	public static void main(String[] args)
 	{
 		int sum = 0,n,ln;
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter  a number : ");
 		n = sc.nextInt();
              int tn = n;
 		for(int i= 0;i<=n;i++)
 		{
                     ln = n%10;
                     sum+=ln;
                     n/=10;
              }
              System.out.println("Sum of "+tn+" is "+sum);
 	}
 }