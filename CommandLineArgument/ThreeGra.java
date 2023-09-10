/* A java program to find the gratest digit between three digits using terneary operater thrugh command line argument */
import java.util.*;
public class ThreeGra{
	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		int grater = (n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
		System.out.println("The numbers are : "+args[0]+","+args[1]+","+args[2]);
		System.out.print(grater+" is Grater");
	}
}