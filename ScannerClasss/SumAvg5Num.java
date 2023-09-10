import	java.util.Scanner;
public class SumAvg{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(" Enter  Five Numbers one By one\n");
		System.out.print("N1 = ");
		float a = s.nextFloat();
		System.out.print("N2 = ");
		float b = s.nextFloat();
		System.out.print("N3 = ");
		float c = s.nextFloat();
		System.out.print("N4 = ");
		float d = s.nextFloat();
		System.out.print("N5 = ");
		float e = s.nextFloat();
		System.out.print("Sum and Average of -> "+a+"+"+b+"+"+c+"+"+d+"+"+e+" is :\n");
		float result = (a+b+c+d+e);
		System.out.print("Sum = "+result);
		System.out.print("\nAverage = "+result/5f);
	}
	 
}