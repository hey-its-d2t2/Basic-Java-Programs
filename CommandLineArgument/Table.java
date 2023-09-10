/* A java program to generate the table of given number thrugh command line argumnent */
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