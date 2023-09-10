/* A java program to find the sum of all Even numbers(up to n)*/
import java.util.Scanner;
public class SumEvenNum{
	public static void main(String[] args) {
		int n,sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the number : ");
		n = s.nextInt();
		for(int i = 1;i <= n;i++){
			if(i % 2 == 0){
				sum += i;
			}
		}
		System.out.print("The sum is : "+sum);
	}
}