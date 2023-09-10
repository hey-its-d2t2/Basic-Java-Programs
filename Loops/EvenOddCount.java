/** Java program to count the even and odd number in a given Integer.*/
 import java.util.Scanner;
 class EvenOddCount
 {
 	public static void main(String[] args)
 	{
 		int ec=0,oc=0,n,ln;
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter  a number : ");
 		n = sc.nextInt();
              int tn = n;
 		for(int i= 0;i<=n;i++)
 		{
                     ln = n%10;
                     if(ln%2 == 0)
                            ec++;
                     else
                            oc++;
                     n/=10;
              }
              System.out.println("Even no = "+ec+"\nOdd no ="+oc);
 	}
 }