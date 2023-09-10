/* A java progrma to create a class having two fields a and b of integer type and write methods to read, print and calculate the sum of fields */
import java.util.Scanner;
class TwoInt
{
	int a,b;
	void setValues(int x,int y)
	{
		a = x;b = y;
	}
	void getValues()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A = ");
		a = sc.nextInt();
		System.out.print("Enter B = ");
		b = sc.nextInt(); 
	}
	void putValues()
	{
		System.out.println("A = "+a+"\nB = "+b);
	}
	int sum()
	{
		return(a+b);
	}
}
class TwoIntMain
{
	public static void main(String[] args)
	{
		TwoInt ti = new TwoInt();
		ti.setValues(10,20);
		ti.putValues();
		System.out.print("Sum = "+ti.sum());
		ti.getValues();
		ti.putValues();
		System.out.println("Sum = "+ti.sum());
	}
}