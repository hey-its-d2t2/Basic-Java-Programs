/* *A java program to swap the digits without  using third variable 
* Input - Command Line Argument
* @Author - DEEPAK KUMAR, RollNo - 92, SEM - III
**/
import java.util.*;
public class Swap{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Before swapping : A = "+args[0]+",B = "+args[1]);
		 a = a+b;
		 b = a-b;
		 a = a-b;
		System.out.println("After swpping : A = "+a+",B = "+b);
	}
} 