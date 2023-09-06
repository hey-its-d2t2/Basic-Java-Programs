/*
Write a program for taking following inputs from user and display them 
back
1. Name
2. Branch
3. Total Marks
4. Number of Subjects
5. Percentage

Do the program for a whole class by first asking "How many 
students are there in the class?" User will input a number. Then take the 
information for all students one by one and display.
*/

import java.util.Scanner;

class Student {
    private String name;
    private String branch;
    private double totalMarks;
    private int numSubjects;
    private double percentage;

    public Student() {
        name = "NA";
        branch = "NA";
        totalMarks = 0.0;
        numSubjects = 0;
        percentage = 0.0;
    }

    public void input() {
        Scanner in = new Scanner(System.in);

        System.out.print("Name: ");
        name = in.nextLine();
        in.next();
        System.out.print("Branch: ");
        branch = in.nextLine();
        System.out.print("Total Marks: ");
        totalMarks = in.nextDouble();
        System.out.print("Number of Subjects: ");
        numSubjects = in.nextInt();
        System.out.print("Percentage: ");
        percentage = in.nextDouble();
        in.nextLine();
    }

    public void display() {
        System.out.println("-----------------------------");
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Number of Subjects: " + numSubjects);
        System.out.println("Percentage: " + percentage + "%");
    }
}

class StdDetails1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of students: ");
        int totalStudents = sc.nextInt();

        Student[] students = new Student[totalStudents];

        for (int i = 0; i < totalStudents; i++) {
            System.out.println("\nEnter details of student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].input();
        }

        System.out.println("\nStudent Information:");
        for (int i = 0; i < totalStudents; i++) {
            students[i].display();
        }
    }
}
