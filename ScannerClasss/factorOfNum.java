/*A java program to find the all factor of number*/
import java.util.Scanner;
public class factorOfNum{
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("Please Enter a Number : ");
		num = s.nextInt();
		System.out.print("The factors are : \n");
		for(int  i = 1;i <= num;i++){
			if(num%i == 0){
				System.out.print("\n"+i);
			}
		}
	}
}