import java.util.Scanner;
class MonthName
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number(<=12) : ");
		int n = in.nextInt();
		// if(n==1)
		// 	System.out.print("january");
		// else if(n==2)
		// 	System.out.print("february");
		// else if(n==3)
		// 	System.out.print("march");
		// else if(n==4)
		// 	System.out.print("april");
		// else if(n==5)
		// 	System.out.print("may");
		// else if(n==6)
		// 	System.out.print("june");
		// else if(n==7)
		// 	System.out.print("july");
		// else if(n==8)
		// 	System.out.print("august");
		// else if(n==9)
		// 	System.out.print("sepetember");
		// else if(n==10)
		// 	System.out.print("october");
		// else if (n==11)
		// 	System.out.print("november");
		// else  if(n==12)
		// 	System.out.print("december");
		// else
		// 	System.out.print("invalid input! try again...");

		// using switch case
		switch(n)
		{
			case 1:
				System.out.print("january");
				break;
			case 2:
				System.out.print("february");
				break;
			case 3:
				System.out.print("march");
				break;
			case 4:
				System.out.print("april");
				break;
			case 5:
				System.out.print("may");
				break;
			case 6:
				System.out.print("june");
				break;
			case 7: System.out.print("july");break;
			case 8:System.out.print("august");break;
			case 9:System.out.print("september");break;
			case 10: System.out.print("october");break;
			case 11:System.out.print("november");break;
			case 12:System.out.print("december");break;
			default:System.out.print("invalid input! try again...");
		}

	}
}