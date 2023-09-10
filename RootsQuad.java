/* A java program to find the roots of quadratic equation check whether the roots are real or imagenary.
*/
import java.util.Scanner;
class RootsQuad
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		double a = sc.nextDouble();
		System.out.print("b =");
		double b = sc.nextDouble();
		System.out.print("c = ");
		double c = sc.nextDouble();
		double d = ((b*b)-(4*a*c));
		double sqrt  = Math.sqrt(d);
		double firstroot = 0,secoandroot = 0;
		if(d > 0 )
		{
			firstroot = ((-b + sqrt)/(2*a));
			secoandroot = ((-b -sqrt)/(2*a));
			System.out.println("Roots are real and distinct : ");
			System.out.println("First root : "+firstroot);
			System.out.println("Secoand root : "+secoandroot);
			
		}
		else if(d == 0)
		{
			 firstroot =  ((-b + sqrt)/(2*a));
		     secoandroot =   ((-b + sqrt)/(2*a));
			System.out.println("Roots are equal :");
			System.out.println("First root  = Secoand root : "+firstroot+" = "+secoandroot);
		}

		else
		{
			 firstroot =  ((-b + sqrt)/(2*a));
		     secoandroot = ((-b + sqrt)/(2*a));
			System.out.println("Roots are imagernary and distinct : ");
			System.out.println("First root : "+firstroot);
			System.out.println("Secoand root : "+secoandroot);
		}
	}

}