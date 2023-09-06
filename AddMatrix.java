/* Write a program to add two matrices */

import java.util.Scanner;

class AddMatrix{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows in a matrix : ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns in a matrix : ");
		int cols = sc.nextInt();

		int[][] matrix1 = new int[rows][cols];
		int[][] matrix2 = new int[rows][cols];
		int[][] sum = new int[rows][cols]; 

		//first matrix
		System.out.println("Enter values for first matrix : ");
		for(int i= 0;i<rows;i++)
			for(int j=0;j<cols;j++)
				matrix1[i][j] = sc.nextInt();

		//second matrix
		System.out.println("Enter values for second matrix : ");
		for(int i = 0;i<rows;i++)
			for (int j = 0;j<cols;j++) 
					matrix2[i][j] = sc.nextInt();

		// add matrix
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				sum[i][j] = matrix1[i][j]+matrix2[i][j];
		
		//print after sum
		System.out.println("Sum of two matrices : ");
		for(int i= 0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}

	}
}
