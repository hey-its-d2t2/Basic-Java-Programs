import java.util.Scanner;
class StudentP_F
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter marks : ");
		double m = sc.nextDouble();
 		double per = (m*100)/500;
		if(per >= 30)
			System.out.println("You have passed .");		
		else						
			System.out.print("Failed !...");
	}
}