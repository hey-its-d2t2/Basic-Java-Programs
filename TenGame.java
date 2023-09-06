import java.util.Scanner;
class TenGame{
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);

		while(true)
		{
			System.out.print("Enter a number :");
			int n = in.nextInt();	
			if(n<=10)
			{
				System.out.println(n);
				continue;
			}
			else
			{
				System.out.print("Game Over");
				break;
			}
		}
	}
}