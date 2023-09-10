/* A java program to find the roots of a quadratic equation thrugs concole class */
import java.io.*;
import java.lang.Math;
public class RootsQu{
	public static void main(String[] args) {
		Console cin = System.console();
		double a = Double.parseDouble(cin.readLine("a = "));
		double b = Double.parseDouble(cin.readLine("b = "));
		double c = Double.parseDouble(cin.readLine("c = "));
		double r1,r2;
		double d = ((b*b)-4*a*c);
		System.out.println("-------------------------------");
		if(d > 0){
			 r1 = (-b + (Math.sqrt(d)/(2*a)));
			 r2 = (-b - (Math.sqrt(d)/(2*a)));
			System.out.println("Two distinct real roots exists \nroot1 = "+r1+"\n,root2 = "+r2);
		}
		else if(d == 0){
			r1 = r2 = -b/(2*a);
			System.out.print("Tho distinct real roots exists  \nroot1 =  "+r1+"\n,root2 = "+r2);
			
		}
		else{
			r1 = r2 = -b/(2*a);
			double img = Math.sqrt(-d)/(2*a);
			System.out.print("Two distinct complex roots exists \nroot1 = "+r1+"\nimaginary = "+img+"\n,root2 = "+r2);

		}
	}
}