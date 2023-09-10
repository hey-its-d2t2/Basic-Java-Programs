/* Java Program to Find Number of Days in a month thrugh console class*/
import java.io.*;
public class DaysinMonth{
	public static void main(String[] args){
		Console cin = System.console();
		int m = Integer.parseInt(cin.readLine("Enter the month(1-12) : "));
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 )
		{
			System.out.println("\n 31 Days in this month");  	
		}
		else if ( m == 4 || m == 6 || m == 9 || m == 11 )
		{
			System.out.println("\n 30 Days in this month");  	
		}  
		else if ( m == 2 )
		{
			System.out.println("\n Either 28 or 29 Days in this month");  	
		} 
		else
			System.out.println("\n Please enter Valid Number between 1 to 12");
	
	}
}