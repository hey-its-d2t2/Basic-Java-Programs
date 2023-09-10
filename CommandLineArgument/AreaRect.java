/**A java program using Command line argument for calculating the area of rectangle */
import java.util.*;
public class AreaRect{
	public static void main(String[] args){
	float l = Float.parseFloat(args[0]);
	float b = Float.parseFloat(args[1]);
	System.out.print("Area of rectangl is : "+(l*b));
	}
}
