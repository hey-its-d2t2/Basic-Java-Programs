/* *A java progrm to find the equivalance of two number(i.e both numbers are equal or not)  
* Input - Command Line Argument
* @Author - DEEPAK KUMAR, RollNo - 92, SEM - III
**/
import java.util.*;
public class Equi{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if((a-b) == 0)
			System.out.print("Both numbers are equal : "+args[0]+" = "+args[1]);
		else
			System.out.print("Given numbers are not equal : "+args[0]+" != "+args[1]);
	}
}