/*  Write a program to provide options of creating objects for different 
shapes like, Circle, Cylinder, Rectangle, Square, etc. User should be 
able to draw the shape and calculate its area & perimeter. */

import java.util.Scanner;

abstract class Shape
{
	public abstract void draw();
	public abstract double calculteArea();
	public abstract double calculatePerimeter();
}

class Circle extends Shape
{
	public double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}

	@Override
	public void draw()
	{
		System.out.println("Drawing Circle");
	}

	@Override
	public double calculteArea()
	{
		return Math.PI*radius*radius;
	}

	@Override
	public double calculatePerimeter()
	{
		return 2*Math.PI*radius;
	}
}

class Cylinder extends Circle
{
	private double height;
	public Cylinder(double radius,double height)
	{
		super(radius);
		this.height = height;
	}

	@Override 
	public  void draw()
	{
		System.out.println("Drawing Cylinder");
	}

	@Override
	public  double calculteArea()
	{
		double baseArea = super.calculteArea();
		double laterArea = 2*Math.PI*radius*height;
		return 2*baseArea+laterArea;
	}

	@Override
	public double calculatePerimeter()
	{
		return super.calculatePerimeter();
	}
	
	public double getHeight()
	{
		return height;
	}

}

class Rectangle extends Shape
{
	private double length;
	private double width;

	public Rectangle(double length,double width)
	{
		this.length = length;
		this.width = width;
	}

	@Override
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}

	@Override
	public  double calculteArea()
	{
		return length*width;
	}

	@Override
	public double calculatePerimeter()
	{
		return 2*(length+width);
	}
}

class Square extends Rectangle
{
	public Square(double side)
	{
		super(side,side);
	}

	@Override
	public void draw()
	{
		System.out.println("Drawing Square");
	}

	@Override
	public double calculteArea()
	{
		return super.calculteArea();
	}

	@Override
	public double calculatePerimeter()
	{
		return super.calculatePerimeter();
	}
}

public class ShapeProgram
{
	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Select a shape to create : ");
		System.out.println("1. Circle");
		System.out.println("2.Cylinder");
		System.out.println("3. Rectangle");
		System.out.println("4. Square");

		int choice = sc.nextInt();

		Shape shape;

		switch(choice)
		{
			case 1:
				System.out.print("Enter the radius of circle : ");
				double radius = sc.nextDouble();
				shape = new Circle(radius);
			break;

			case 2:
				System.out.print("Enter the radius of the cylinder : ");
				radius = sc.nextDouble();
				System.out.print("Enter the height of cylinder : ");
				double height = sc.nextDouble();

				shape = new Cylinder(radius,height);
			break;

			case 3:
				System.out.print("Enter the length of the rectangle : ");
				double length = sc.nextDouble();
				System.out.print("Enter the width of the rectangle : ");
				double width = sc.nextDouble();

				shape = new Rectangle(length,width);
			break;

			case 4 :
				System.out.print("Enter the side of the square : ");
				double side = sc.nextDouble();

				shape = new Square(side);
			break;

			default:
				System.out.print("Invalid choice... Exiting the prograam.");
				return;

		}

		shape.draw();
		System.out.println("Area : "+shape.calculteArea());
		System.out.println("Perimeter : "+shape.calculatePerimeter());
		sc.close();
	}
}