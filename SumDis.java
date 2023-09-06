//Taking Input using Data Input Stream
import java.io.*;
class SumDis{
	public static void main(String[] args) throws IOException{
		int a,b;
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("A = ");
		a = Integer.parseInt(dis.readLine());
		System.out.print("B = ");
		b = Integer.parseInt(dis.readLine());
		System.out.print("Sum = "+(a+b));
	}
}