/*
Write a program for taking following inputs from user and display them 
back
1. Name
2. Branch
3. Total Marks
4. Number of Subjects
5. Percentage
*/
import java.util.Scanner;
class StdDetails{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name,branch;
		double tmarks,per;
		tmarks = per = 0.0;
		int tsub =0;

		//input
		System.out.print("Name : ");
		name = in.nextLine();
		System.out.print("Branch : ");
		branch = in.nextLine();
		System.out.print("Total Marks : ");
		tmarks = in.nextDouble();
		System.out.print("Number of Subjects : ");
		tsub = in.nextInt();
		System.out.print("Percentage : ");
		per = in.nextDouble();

		//output
		System.out.println("----------------------------");
		System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Total Marks: " + tmarks);
        System.out.println("Number of Subjects: "+tsub);
        System.out.println("Percentage: " + per + "%");


	}
}