import java.io.*;
class SumAvg
{
	public static void main(String[] args) throws IOException
	{	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter A = ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("Enter B = ");
		int b = Integer.parseInt(br.readLine());
		int sum = a + b;
		int avg = sum / 2;
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+avg);
	}
}