/*Largest Factor of a Number N (Othe then the number it self)*/
import java.util.Scanner;
public class LargestFactorNum{
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("Please Enter a Number : ");
		num = s.nextInt();
		for(int i =(num-1);i>=0;i--){
			if(i==0){
				System.out.println("1");
				break;
			}if(num%i == 0){
				System.out.println(i);
				break;
			}
		}
	}
}