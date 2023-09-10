/** A java program to count the number of digit in a number
 * Input - Using InputStreamReader and BufferedReader
 * @Author - DEEPAK KUMAR, RollNo - 92, SEM - III
**/
import java.io.*;
class CountDigit{
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the Digit : ");
		int d = Integer.parseInt(br.readLine());
		int count,temp = d;
		for(count = 0;temp > 0;temp = temp/10){
			count = count+1;
		}
		System.out.print("The numbers of digits in "+d+" is : "+count);
		
	}
}