/* a java program to find the area and circumference of a circle using class object */
import java.util.Scanner;
class CircleArCr
{
	double r;
	void setValues(double rd)
	{
		r = rd;
	}
	void getValues()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radious : ");
		r = sc.nextDouble();
	}
	void area()
	{
		System.out.println("Area of circle : "+(3.141*r*r));
	}
	void cer()
	{
		System.out.println("Circumference of circle : "+(2*3.141*r));
	}
}
class CircleArPrMain
{
	public static void main(String[] args)
	{
		CircleArCr c = new CircleArCr();
		c.setValues(12.34);
		c.area();
		c.cer();
		c.getValues();
		c.area();
		c.cer();

	}
}