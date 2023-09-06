/** A java program to find the area of a circle,
*using class, object, constructor, destructor and methods */
import java.util.Scanner;
class Area
{
	double area,radious;
	Area()
	{
		area = 0.0;
		radious = 0.0;
	}
	Area(double radious)
	{
		radious = radious;
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
	}
} 
public class AreaCircle{
	public static void main(String[] args) {
		Area a = new Area(10);
		a.output();
		a.input();
		a.output();
		
	}
}