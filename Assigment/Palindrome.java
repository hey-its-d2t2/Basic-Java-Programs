/* *A java program to check the given number is palindrome or not 
* Input - Concole class
*@Author - DEEPAK KUMAR, RollNo- 92, SEM - III
**/
import java.io.Concole;
public class Palindrome{
	public static void main(String[] args) {
		Console cin = System.console();
		int n = Integer.parseInt(cin.readLine("Enter Number : "));
		int rev=0,rem,temp = n;
		while(n > 0){
			 rem = n%10;
			 rev = rev*10+rem;
			 n = n/10;
		}
		if(temp == rev)
			System.out.println(temp+" is palindrome number");
		else
			System.out.print(temp+" is not a palindrome number");
	}

}