/* *A java program to find the sum of all odd numbers(up to n)
* Input - Scanner class
* @Author - DEEPAK KUMAR, RollNo - 92, SEM - III
**/
import java.util.Scanner;
public class SumOddNum{
	public static void main(String[] args) {
		int n,sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter a number : ");
		n = s.nextInt();
		for(int i = 1;i <= n;i++){
			if(i%2 == 1){
				sum += i;
			}
		}
		System.out.print("The sum is : "+sum);
	}
}