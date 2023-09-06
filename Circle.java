/** A java program to find the area and circumference of a circle,
*using class, object, constructor and methods */
import java.util.Scanner;
class CircleArea
{
	double area,radious,cirf;
	CircleArea()
	{
		area = 0.0;
		radious = 0.0;
		cirf = 0.0;
	}
	CircleArea(double radious,double cf)
	{
		radious = radious;
		cirf = cf;
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rdious of circle : ");
		radious = sc.nextDouble();
	}
	void output()
	{
		System.out.println("Area of circle : "+(3.141*radious*radious));
		System.out.println("Circumference of circle : "+(2*3.141*radious));
	}
} 
public class Circle{
	public static void main(String[] args) {
		CircleArea c1 = new CircleArea(10,20);
		c1.output();
		c1.input();
		c1.output();
		CircleArea c2 = new CircleArea();	
		c2.output();
		c2.input();
		c2.output();
		
	}
}