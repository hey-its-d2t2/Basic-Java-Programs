/* A java program to show the weeek day according the number using command line argument */
import java.util.*;
public class WeekDay {
	public static void main(String[] args){
		int n =Integer.parseInt(args[0]);
		switch(n){
			case 1:
				System.out.print("Sunday");
				break;
			case 2:
				System.out.print("Monday");
				break;
			case 3:
				System.out.print("Tuesday");
				break;
			case 4:
				System.out.print("Wensday");
				break;
			case 5:
				System.out.print("Thursday");
				break;
			case 6:
				System.out.print("Friday");
				break;
			case 7:
				System.out.print("Saturday");
				break;
			default :
				System.out.print("Invalid Input");
				break;
		}
	}
}
