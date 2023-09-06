/**A java program to input the imployee details and print them
 * using class, obj and constructor 
 * @author DEEEPAK SINGH  */
import java.util.Scanner;
class EmpDetails
{
	String e_name, e_id, e_shift, e_post, e_aadhar, e_phno;
	double e_salary;
	EmpDetails()
	{
		e_name = "Your Name";
		e_id = "AB1234567DET";
		e_shift = "First/Secoand/Night";
		e_post = "1st Grade/ 2nd Grade / 3rd Grade";
		e_aadhar = "1122343245543";
		e_phno = "1234567809";
		e_salary = 20000.0;
	}
	EmpDetails(String nm, String id, String sh, String po, String aad, String ph, double sal)
	{
		e_name = nm;
		e_id = id;
		e_shift = sh;
		e_post = po;
		e_aadhar = aad;
		e_phno = ph;
		e_salary = sal;
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Details ::");
		System.out.print("Name : ");
		e_name = sc.nextLine();
		System.out.print("ID  : ");
		e_id = sc.nextLine();
		System.out.print("Shift : ");
		e_shift = sc.nextLine();
		System.out.print("Post : ");
		e_post = sc.nextLine();
		System.out.print("Aadhar No. : ");
		e_aadhar = sc.nextLine();
		System.out.print("Phone No. : ");
		e_phno = sc.nextLine();
		System.out.print("Salary : ");
		e_salary = sc.nextDouble();
	}
	void output()
	{
		System.out.println("----------------------------------------------");
		System.out.println("E. Name : "+e_name);
		System.out.println("E. ID : "+e_id);
		System.out.println("E. Shift : "+e_shift);
		System.out.println("E. Post : "+e_post);
		System.out.println("E. Aadhar No. : "+e_aadhar);
		System.out.println("E. Phone No. : "+e_phno);
		System.out.println("E. Salary : "+e_salary);
		System.out.println("----------------------------------------------");
	}
}
class Employee
{
	public static void main(String[] args)
	{
		EmpDetails epara = new EmpDetails("Your Name","ADT12","1/2/N","1/2/3Grade","123123123","124421124",1000.0);
		epara.output();
		EmpDetails edef = new EmpDetails();
		edef.output();
		EmpDetails e = new  EmpDetails();
		e.input();
		e.output();
	}
}