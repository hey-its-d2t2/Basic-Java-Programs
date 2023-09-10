/* A java progrma to create a Player class and initilise its fieldds with the help of constructors and also take the input by the user */
import java.util.Scanner;
class PlayerDetails
{
	String pname,teamname,gender,address;
	int playno,age;
	PlayerDetails()
	{
		pname = "Rohit Sharma";
		teamname = "Indian Cricket Team";
		gender = "Male";
		address = "Mumbay,India.";
		playno = 1;
		age = 30;
	}
	PlayerDetails(String pn,String tn, String g,String ad,int pno,int ag)
	{
		pname = pn;
		teamname = tn;
		gender = g;
		address = ad;
		playno = pno;
		age = ag;
	}
	void dispDetails()
	{
		System.out.println("--------------------------------------------------");
		System.out.println("Player name : "+pname);
		System.out.println("Age : "+age);
		System.out.println("Player no . : "+playno);
		System.out.println("Team name : "+teamname);
		System.out.println("Gender  : "+gender);
		System.out.println("Address : "+address);
		System.out.println("-------------------------------------------------");
	}
	void readDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter player name : ");
		pname = sc.nextLine();
		System.out.print("Enter tema name : ");
		teamname = sc.nextLine();
		System.out.print("Enter gender : ");
		gender = sc.nextLine();
		System.out.print("Enter address : ");
		address = sc.nextLine();
		System.out.print("Enter ager : ");
		age = sc.nextInt();
		System.out.print("Enter player no . : ");
		playno = sc.nextInt();
	}

}
class PlayerMain
{
	public static void main(String[] args)
	{
		PlayerDetails pd = new PlayerDetails();
		pd.dispDetails();

		PlayerDetails pd1 = new PlayerDetails("M. S. Dhoni","Indian Cricket Tema","Male","Ranchi India",1,45);
		pd1.dispDetails();

		pd1.readDetails();
		pd1.dispDetails();
		
	}
}
