/* A java program to create a Emloye Class and read values by user and display, using class object and constructor */
import java.util.Scanner;
class EmployeeDetails
{
	String name,mob,address,gender,jobpost,dep,dutytime;
	int eid;
	double salary;
	EmployeeDetails()
	{
		name = "Deepak Singh";
		eid = 292;
		salary = 500.0;
		mob = "9525357044";
		gender = "Male";
		jobpost = "Worker";
		dep = "Customer Support";
		dutytime = "10 AM to 5 PM";
		address = "Bhagalpur";
	}
	EmployeeDetails(String nm,int id,double sal,String mn,String jp,String ad,String g,String d,String dt)
	{
		name = nm;
		eid = id;
		salary = sal;
		mob = mn;
		jobpost = jp;
		address = ad;
		gender = g;
		dep = d;
		dutytime = dt;
	}
	EmployeeDetails(EmployeeDetails obj)
	{
		name = obj.nm;
		eid = obj.id;
		salary = obj.sal;
		mob = obj.mn;
		address = obj.ad;
		gender = obj.g;
		dep = obj.d;
		dutytime = obj.dt;
	}
	void readDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("Enter ID : ");
		eid = sc.nextInt();
		System.out.print("Enter salary : ");
		salary = sc.nextDouble();
		System.out.print("Enter mob no. : ");
		mob = sc.nextLine();
		System.out.print("Enter address  : ");
		address = sc.nextLine();
		System.out.print("Enter gender : ");
		gender = sc.nextLine();
		System.out.print("Enter job post : ");
		jobpost = sc.nextLine();
		System.out.print("Enter department : ");
		dep = sc.nextLine();
		System.out.print("Enter duty time : ");
		dutytime = sc.nextLine();
	}
	void dispValues()
	{
		System.out.println("Name : "+name);
		System.out.println("ID : "+eid);
		System.out.println("Salary : "+salary);
		System.out.println("Mobile No. : "+mob);
		System.out.println("Address : "+address);
		System.out.println("Gender : "+gender);
		System.out.println("Job Post : "+jobpost);
		System.out.println("department : "+dep);
		System.out.println("Duty Time : "+dutytime);
	}
}
class Employee
{
	public static void main(String[] args)
	{
		EmployeeDetails ed = new EmployeeDetails();
		EmployeeDetails ed1 = new EmployeeDetails("Rohit Kuamr",111,50000.0,"090909090","Co founder","Bhagalpur","Male","Managment","24X7");
		EmployeeDetails ed2 = new EmployeeDetails(ed1);	
		ed.dispValues();
		ed1.dispValues();
		ed.readDetails();
		ed.dispValues();
	}
}