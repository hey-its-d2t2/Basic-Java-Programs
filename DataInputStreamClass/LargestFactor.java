/** A java program to count the Largest factor of a given number
 * Input -  DataInputStream class
 * @Author - DEEPAK KUMAR, RollNo - 92, SEM - III
**/
import java.io.*;
class LargestFactor{
	public static void main(String[] args) throws IOException {
		int n;
		DataInputStream din = new DataInputStream(System.in);
		System.out.print("Enter a number : ");
		n = Integer.parseInt(din.readLine());
		System.out.print("The Factors are : \n");
		for(int i = (n-1);i >= 0;i--){
			if(i == 0){
				System.out.print("1");
				break;
			}
			if(n%i == 0){
				System.out.print(i);
				break;}
		}
	}
}