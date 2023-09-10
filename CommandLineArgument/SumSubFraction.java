/* A java program of summation of fraction(a/b + c/d) using command line argument */
import java.util.*;
public class SumSubFraction{
	public static void main(String[] args){
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		float c = Float.parseFloat(args[2]);
		float d = Float.parseFloat(args[3]);
		System.out.println("The Summation of "+args[0]+"/"+args[1]+" + "+args[2]+"/"+args[3]+" is : "+((a/b)+(c/d)));
		System.out.println("The Subtraction of "+args[0]+"/"+args[1]+" - "+args[2]+"/"+args[3]+" is : "+((a/b)-(c/d)));
	}
} 