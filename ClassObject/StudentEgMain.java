/* A java progrma to read the details of students from user and display the given values use class object and method */
import java.util.Scanner;
class Student
{
	String name,dob,gender,mob;
	int roll;
	double marks;
	void setDetails(String nm,int rn,String db,String g,String mn,double m)
	{
		name = nm;
		roll = rn;
		dob = db;
		gender = g;
		mob = mn;
		marks = m;
	}
	void getDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("Enter roll : ");
		roll = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter DOB : ");
		dob = sc.nextLine();
		System.out.print("Enter gender : ");
		gender = sc.nextLine();
		System.out.print("Enter marks : ");
		marks = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter mobile no. : ");
		mob = sc.nextLine();
	}
	void putDetails()
	{
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		System.out.println("Name : "+name);
		System.out.println("Roll No. : "+roll);
		System.out.println("Marks : "+marks);
		System.out.println("D.O.B : "+dob);
		System.out.println("Gender : "+gender);
		System.out.println("Mobile No. : "+mob);
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
	}

}
class StudentEgMain
{
	public static void main(String[] args)
	{
		Student s = new Student();
		s.setDetails("Deepak Singh",92,"12/12/2001","Male","9525357044",59.2);
		s.putDetails();
		s.getDetails();
		s.putDetails();

	}
}