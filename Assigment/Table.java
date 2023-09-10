/* *A java program to generate the table of given number  
* Input - Command Line Argument
* @Author - DEEPAK KUMAR, RollNo - 92, SEM - III
**/
import java.util.*;
public class Table{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		System.out.println("----------------------------------------------");
		System.out.println("The table of given number "+args[0]+" is : ");
		System.out.println("----------------------------------------------");
		for(int i = 1;i <= 10;i++){
			System.out.println("\t"+(i*a));
		}
		System.out.print("---------------------------------------------");
	}
}