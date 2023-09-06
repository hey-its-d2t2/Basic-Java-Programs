/**A java program to input the student details and print them
 * using class, obj and constructor 
 * @author DEEEPAK SINGH  */
import java.util.Scanner;
class Student
{
	Scanner sc = new Scanner(System.in);
	String name,regno,dob;
	int roll;
	Student()
	{
		String name = "Enter Your Name";
		String regno = "0123456789";
		String dob = "01/01/2001";
		roll = 1;

	}
	Student(int roll,String nm,String regno,String db)
	{
		roll = roll;
		name = nm;
		regno = regno;
		dob = db;
	}
	void input()
	{
		System.out.print("Enter Roll : ");
		roll = sc.nextInt();
		System.out.print("Enter Name : ");
		sc.nextLine();
		name  = sc.nextLine();
		System.out.print("Enter Reg. No. : ");
		regno = sc.nextLine();
		System.out.print("Enter D.O.B  : ");
		dob = sc.nextLine();
	}
	void output()
	{
		System.out.println("--------------------------");
		System.out.println("Name : "+name);
		System.out.println("Roll No. : "+roll);
		System.out.println("Reg No. : "+regno);
		System.out.println("D.O.B : "+dob);
	}
}
class StudentDetails
{
	public static void main(String[] args)
	{
		Student s = new Student(1,"Your Name","000000000","01/01/2001");
		s.output();
		Student s1 = new Student();
		System.out.println("------------------------");
		s1.output();
		s1.input();
		s1.output();

	}
}