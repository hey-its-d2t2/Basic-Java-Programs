/* A java program to check wether the given  number is arm strong number or not thrugh console class */
import java.io.*;
public class ArmstrongNo{
	public static void main(String[] args) {
		Console cin = System.console();
		int n = Integer.parseInt(cin.readLine("Enter number : "));
		int temp = n,sum = 0;
		while(temp > 0){
			int rem = n%10;
			sum += Math.pow(rem,3);
			temp = temp/10;
		}
		if(sum == n)
			System.out.print(n+" is an armstrong number");
		else
			System.out.print(n+" is not an armstrong number");
	}
}