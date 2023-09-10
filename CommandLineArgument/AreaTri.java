/* A java program to find the area of the tringle using command line argumert */
import java.util.*;
public class AreaTri{
	public static void main(String[] args){
		float b = Float.parseFloat(args[0]);
		float h = Float.parseFloat(args[1]);
		System.out.println("The area of tringle is :");
		System.out.println("Base = "+args[0]);
		System.out.println("Hieght = "+args[1]);
		System.out.println("Area = "+(1/2*(b*h)));
	}
}