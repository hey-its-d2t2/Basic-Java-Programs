/* A java program to conver the Celsius into Fahrenheit using command line argument */
import java.util.*;
public class CelsiusFahrenheit{
	public static void main(String[] args) {
		int cel = Integer.parseInt(args[0]);
		float fer = ((cel*1.8)+32);
		System.out.print(args[0]+"c in f is : "+fer);
	}
}