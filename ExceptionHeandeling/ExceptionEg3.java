//Divide by zero
public class ExceptionEg3 
{
	public static void main(String args[]) 
	{

		int n1, n2;
		try 
		{

			n1 = 0;
			n2 = 100 / n1;
			System.out.println(n2);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("The divider cannot be zero, try a differnt number.");		
		} 
		catch (Exception e) 
		{
			System.out.println("You cannot execute this program: DivideByZeroException");

		}
	}
}