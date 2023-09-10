import java.util.Scanner;
class StudentP_F_TN
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter total marks : ");
		System.out.print("1st paper : ");
		double fp = sc.nextDouble();
		System.out.print("2nd paper : ");
		double sp = sc.nextDouble();
		System.out.print("3rd paper : ");
		double tp = sc.nextDouble();
		System.out.print("4th paper : ");
		double fop = sc.nextDouble();
		System.out.print("5th paper : ");
		double fth = sc.nextDouble();
		System.out.print("6th paper : ");
		double sth = sc.nextDouble();
		double total = (fp+sp+tp+fop+fth+sth);
 		double per = ((total*100)/600);
		if(per >= 30 && per < 50)
			System.out.println("You have passed with  third div.");		
		else if (per >= 50 && per < 75)
			System.out.println(" You have passed with second div.");
		else if (per >= 75 && per < 80 )
			System.out.println("You have passed with first div.");
		else if(per >= 80)
			System.out.print("You have passed with distinction.");
		else 
			System.out.println("Fail !...");
	}
}