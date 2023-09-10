/* a java progrma to create a book class and initilise its fieldds with the help of constructors and also take the input by the user */
import java.util.Scanner;
class Book
{
	String bname,aname,pubname,edition,bseller;
	int pageno;
	double price;
	Book()
	{
		bname = "Object Oriented Programming with Java";
		aname = "E Balagurusamy";
		pubname = "McGraw Hill Education";
		edition = "7e";
		bseller = "Kora kagaz";
		pageno = 555;
		price = 490.0;
	}
	Book(String bn,String an,String pn,String ed,String bs,int pno,double pr)
	{
		bname = bn;
		aname = an;
		pubname = pn;
		edition = ed;
		bseller = bs;
		pageno = pno;
		price = pr;
	}
	void dispDetails()
	{
		System.out.println("Book name : "+bname);
		System.out.println("Authors name  : "+aname);
		System.out.println("Publicasers name  : "+pubname);
		System.out.println("Edition : "+edition);
		System.out.println("Book sellor : "+bseller);
		System.out.println("Page no. : "+pageno);
		System.out.println("Price : "+price);
	}
	void readDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book name : ");
		bname = sc.nextLine();
		System.out.print("Enter authors name : ");
		aname = sc.nextLine();
		System.out.print("Enter publicaseors name : ");
		pubname = sc.nextLine();
		System.out.print("Enter edition : ");
		edition = sc.nextLine();
		System.out.print("Enter book sellor name : ");
		bseller = sc.nextLine();
		System.out.print("Enter total page no. : ");
		pageno = sc.nextInt();
		System.out.print("Enter price : ");
		price = sc.nextDouble();

	}
}
class BookMain
{
	public static void main(String[] args)
	{
		Book b = new Book();
		b.dispDetails();
		System.out.print("---------------------------------------------------------");
		Book b1 = new Book("Programming in C","Reema Theraja","Oxford Publication","Secoand Edition","Kora kagaz",463,550.0);
		b1.dispDetails();			
		System.out.print("---------------------------------------------------------");
		Book b2 = new Book();
		b2.readDetails();
		System.out.println("-----------------------------------------------------");
		b2.dispDetails();
	}
}