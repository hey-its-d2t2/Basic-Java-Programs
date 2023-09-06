/* Write a program to create a matrix of an order given by user, take 
elements of matrix from user and then print the matrix */

import java.util.Scanner;

class UMatrix{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows in the matrix : ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns in the matrix : ");
		int cols = sc.nextInt();

		int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix : ");
        for(int i =0;i<rows;i++)
        	for(int j=0;j<cols;j++){
        		System.out.print("Enter element at position [" + i + "][" + j + "] : ");
        		matrix[i][j] = sc.nextInt();
        	}
        System.out.print("The matrix is : ");
        for(int i=0; i<rows;i++){
        	for(int j= 0;j<cols;j++){
        		System.out.print(matrix[i][j]+" ");
        	}
        	System.out.println();
        }
	}
}