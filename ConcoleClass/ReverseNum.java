/* *A java program to find the reverse of a number  
* Input - Concole class
*@Author - DEEPAK KUMAR, RollNo- 92, SEM - III
**/
import java.io.*;
public class ReverseNum{
	public static void main(String[] args) {
		Console cin = System.console();
		int n = Integer.parseInt(cin.readLine("Enter Number : "));
		int rev=0,rem,temp = n;
		while(n > 0){
			 rem = n%10;
			 rev = rev*10+rem;
			 n = n/10;
		}
		System.out.print("The reverse of the number "+temp+" is : "+rev);
	}
}