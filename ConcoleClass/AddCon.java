/** A java program to add two numbers by taking input using Concloe class */
//import java.io.Console;
class AddCon
{
	public static void main(String[] args)
	{
		//Console cin = System.console();
		int a = Integer.parseInt(System.console().readLine("A = "));
		int b = Integer.parseInt(System.console().readLine("B = "));
		System.out.print("Sum = "+(a+b));
	}
}