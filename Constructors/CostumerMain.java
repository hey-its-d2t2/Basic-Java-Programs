/* A java progrma to create a Customer class and initilise its fieldds with the help of constructors and also take the input by the user */
import java.util.Scanner;
class CostumerDetails
{
	String cnmae,address,mno;
	int age;
	double totalprice;
	CostumerDetails()
	{
		cnmae = "Deepak Singh";
		address = "Bhagalpur";
		mno = "9525357044";
		age  = 20;
		totalprice = 1270.80;
	}
	CostumerDetails(String cn,String ad, String mn,int ag,double tp)
	{
		cnmae = cn;
		address = ad;
		mno = mn;
		age = ag;
		totalprice = tp; 
	}
	void readDeatils()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer name : ");
		cnmae = sc.nextLine();
		System.out.print("Enter address : ");
		address = sc.nextLine();
		System.out.print("Mobile No. : ");
		mno = sc.nextLine();
		System.out.print("Age : ");
		age = sc.nextInt();
		System.out.print("Total price :");
		totalprice = sc.nextDouble();
	}
	void dispDetails()
	{
		System.out.println("-------------------------------------------------------");
		System.out.println("Costumer name : "+cnmae);
		System.out.println("Adress : "+address);
		System.out.println("Mobile No. : "+mno);
		System.out.println("Age  :"+age);
		System.out.println("Total price : "+totalprice);
		System.out.println("-------------------------------------------------------");
	}
}
class CostumerMain
{
	public static void main(String[] args)
	{
		CostumerDetails cd = new CostumerDetails();
		cd.dispDetails();
		CostumerDetails cd1 = new CostumerDetails("Rohit Kumar","Bhagalpur","123456789",21,100.50);
		cd1.dispDetails();
		cd1.readDeatils();
		cd1.dispDetails();
		
	}
}