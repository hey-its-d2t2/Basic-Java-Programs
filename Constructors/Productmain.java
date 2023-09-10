/* A java progrma to create a Product class and initilise its fieldds with the help of constructors and also take the input by the user */
import java.util.Scanner;
class ProductDetails
{
	String pname,mfgdate,expdate,batchno,brand,quantity;
	double price;
	ProductDetails()
	{
		pname = "Dhara Oil";
		mfgdate = "26/10/2021";
		expdate = "26/10/2022";
		batchno = "12DGh453J";
		brand = "Dhara";
		quantity = "2 Liter";
		price = 220.0;
	}
	ProductDetails(String pn,String md,String ed,String bn,String bd,String qn,double pr)
	{
		pname = pn;
		mfgdate = md;
		expdate = ed;
		batchno = bn;
		brand = bd;
		quantity = qn;
		price = pr;
	}
	void readDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter product name : ");
		pname = sc.nextLine();
		System.out.print("Enter manufacturing date : ");
		mfgdate = sc.nextLine();
		System.out.print("Enter expirey date : ");
		expdate = sc.nextLine();
		System.out.print("Enter batch no . : ");
		batchno = sc.nextLine();
		System.out.print("Enter brand : ");
		brand = sc.nextLine();
		System.out.print("enter quantity : ");
		quantity = sc.nextLine();
		System.out.print("Enter price : ");
		price = sc.nextDouble();
	}
	void dispDetails()
	{
		System.out.println("---------------------------------------------------");
		System.out.println("Product name : "+pname);
		System.out.println("Mfg. Date :  "+mfgdate);
		System.out.println("Exp. Date"+expdate);
		System.out.println("Batch no : "+batchno);
		System.out.println("Brand : "+brand);
		System.out.println("Quantity  : "+quantity);
		System.out.println("Price : "+price);
		System.out.println("---------------------------------------------------");
	}
}
class ProductMain
{
	public static void main(String[] args)
	{
	
	ProductDetails pd  =new ProductDetails();
	pd.dispDetails();
	ProductDetails pd1 = new ProductDetails("Munna Raja Miaxure","25/10/201","25/07/2022","1234SFg54","Kusum Mixtures","250g",32);
	pd1.dispDetails();

	pd1.readDetails();
	pd1.dispDetails();	

	}
}