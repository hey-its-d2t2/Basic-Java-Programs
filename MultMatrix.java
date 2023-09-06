/*  Write a program to multiply two matrices */

import java.util.Scanner;

class MultMAtrix{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows in 1st matrix : ");
		int row1 = sc.nextInt();
		System.out.print("Enter the number of columns in 1st matrix : ");
		int cols1 = sc.nextInt();

		System.out.print("Enter the number of rows in 2nd matrix : ");
		int row2 = sc.nextInt();
		System.out.print("Enter the number of columns in 2nd matrix : ");
		int cols2 =sc.nextInt();

		if(cols1 != row2){
			System.out.print("Matrix multiplication is not possible. Column of first matrix should be equal to the row of the second matrix.");
			return;
		}

		int[][] matrix1 = new int[row1][cols1];
		int[][] matrix2 = new int[row2][cols2];
		int[][] product = new int[row1][cols2];

		///first matrix
		System.out.println("Enter values for first matrix : ");
		for(int i=0;i<row1;i++){
			for(int j=0;j<cols1;j++){
				System.out.print("Enter element at position [" + i + "][" + j + "]: ");
				matrix1[i][j] = sc.nextInt();
			}
		}

		//Second matrix
		System.out.println("Enter values for second matrix : ");
		for(int i=0;i<row2;i++){
			for(int j=0;j<cols2;j++){
				System.out.print("Enter element at position [" + i + "][" + j + "]: ");
				matrix2[i][j] = sc.nextInt();		
			}
		}

		//Multiplication
		for(int i=0;i<row1;i++){
			for(int j=0;j<cols2;j++){
				for(int k=0;k<cols1;k++){
					product[i][j] += matrix1[i][k] * matrix2[k][j]; 
				}
			}
		}

		//Display
		System.out.println("Matrix after multiplication : ");
		for(int i=0;i<row1;i++){
			for(int j=0;j<cols2;j++){
				System.out.print(product[i][j]+" ");
			}
			System.out.println();
		}
	}
}