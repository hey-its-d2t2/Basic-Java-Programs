/**A Java Program to calculate the 
 * area and perimeter of a rectangle 
 * using class, object and constructors*/
import java.util.Scanner;
class Rect
{
	double l,b;
	Rect()
	{
		l=b=0.0;
	}
	Rect(double x,double y)
	{
		l=x;
		b=y;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Length=");
		l=sc.nextDouble();
		System.out.print("Breadth=");
		b=sc.nextDouble();
	}
	void display()
	{
		System.out.println("Length="+l+", Breadth="+b);
	}
	double area()
	{
		double ar;
		ar=l*b;
		return(ar);
	}
	double peri()
	{
		double pr;
		pr=2*(l+b);
		return(pr);
	}
}
public class Rectangle
{
	public static void main(String[] args)
	{
		Rect r=new Rect(3.5,2.8);
		r.display();
		System.out.printf("Area=%.2f\n",r.area());
		System.out.println("Perimeter="+r.peri());
		r.input();
		r.display();
		System.out.println("Area="+r.area());
		System.out.println("Perimeter="+r.peri());
	}
}
