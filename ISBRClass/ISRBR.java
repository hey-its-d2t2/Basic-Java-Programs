*Input by using InputStreamReader and BufferedReader Class*/
import java.io.*;
class AddISRBR
{
	public static void main(String[] args) throws IOException 
	{
		int a,b,c;
		//InputStreamReader isr=new InputStreamReader(System.in);
	//	BufferedReader br=new BufferedReader(isr);
		BufferedReader br=new BufferedReader
		                   (new InputStreamReader(System.in));
		System.out.print("A=");
		a=Integer.parseInt(br.readLine());
		System.out.print("B=");
		b=Integer.parseInt(br.readLine());
		c=a+b;
		System.out.print("Sum="+c);
	}
}
