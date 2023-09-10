/*Java Program to Count Number of Digits in a Number using For Loop thrugh console class */
import java.io.*;
public class CountDigit{
	public static void main(String[] args){
		Console cin = System.console();
		int n = Integer.parseInt(cin.readLine("Enter the number : "));
		int count,temp = n;
		for(count = 0;temp > 0;temp = temp/10){
			count = count+1;
		}
		System.out.print("The number of digist in "+n+" is :"+count);
	}
}