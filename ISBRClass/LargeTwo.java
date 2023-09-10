/** A java program to find the largest number in  between Two Numbers 
 * Input - Using InputStreamReader and BufferedReader
 * @Author - DEEPAK KUMAR, RollNo - 92, SEM - III
**/
import java.io.*;
class LargeTwo{
	public static void main(String[] args) throws IOException {
		int a,b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("A = ");
		a = Integer.parseInt(br.readLine());
		System.out.print("B = ");
		b = Integer.parseInt(br.readLine());
		System.out.print("Largest = "+((a>b)?a:b));
		
	}
}