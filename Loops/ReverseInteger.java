/** Java program to reverse a given  Integer.*/
 import java.util.Scanner;
 class ReverseInteger
 {
 	public static void main(String[] args)
 	{
 		int n,ln,rev=0;
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter  a number : ");
 		n = sc.nextInt();
              int tn = n;
 		for(int i= 1;i<=n;i++)
 		{
                     ln = n%10;
                     rev = (rev*10)+ln;
                     n/=10;
              }
              System.out.println("Reverse of "+tn+" is : "+rev);
 	}
 }