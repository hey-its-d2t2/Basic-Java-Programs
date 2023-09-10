/* A java program to find the area and perimeater of a reactangle using class object */
import java.util.Scanner;
class RectAreaPeri
{
	double l,b;
	void setValues(double ln,double bd)
	{
		l = ln;b = bd;
	}
	void getValues()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length : ");
		l = sc.nextDouble();
		System.out.print("Enter breadth : ");
		b = sc.nextDouble();
	}
	void area()
	{
		System.out.println("Area of rectangle : "+(l*b));
	}
	void peri()
	{
		System.out.print("Perimeater of rectangle : "+(2*(l+b)));
	}
}
class RectangleArPrMain
{
	public static void main(String[] args)
	{
		RectAreaPeri  r = new RectAreaPeri();
		r.setValues(10,20);
		r.area();
		r.peri();
		r.getValues();
		r.area();
		r.peri(); 
	}
}