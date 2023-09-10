/* *A java progrma to foind the factorial of a number 
*Input - Scanner class
*@Author - DEEPAK KUMAR, RollNo - 92, SEM - III
**/
import java.util.Scanner;
class FactorialNum{
	public static void main(String[] args) {
		int n,fact = 1;
		Scanner s = new Scanner(System.in);
		System.out.print("Please Enter A Number : ");
		n = s.nextInt();
		for(int i = 1;i <= n;i++){
			fact *= i;
		}
		System.out.print("The Factorial is : "+fact);
	}
}