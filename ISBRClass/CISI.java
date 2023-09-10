/** A java program to find the Compound Interest and Simple Interest
 * Input - Using InputStreamReader and BufferedReader
 * @Author - DEEPAK KUMAR, RollNo - 92, SEM - III
**/
import java.io.*;
class CISI{
	public static void main(String[] args) throws IOException {
		double pr,rate,t,sim,com;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the amount : ");
		pr = Integer.parseInt(br.readLine());
		System.out.print("Entet the no. of years : ");
		t = Integer.parseInt(br.readLine());
		System.out.print("Enter the rate of interest : ");
		rate = Integer.parseInt(br.readLine());
		sim = (pr*t*rate)/100;
		com = pr*Math.pow((1.0+rate/100.0),t)-pr;
		System.out.println("Simple Interest : "+sim);
		System.out.println("Compound Interaste : "+com);
		
	}
}