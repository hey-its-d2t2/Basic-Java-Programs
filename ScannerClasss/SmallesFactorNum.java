/* A java program to find the smallest factor of a number n (except 1) */
import java.util.Scanner;
public class SmallestFactorNum{
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("Please Enter A Number : ");
		num  = s.nextInt();
		System.out.println("The Factors aer : ");
		for(int i = 2;i <= num;i++){
			if(num%i == 0){
				System.out.println(i);
			}
		}
	}
}