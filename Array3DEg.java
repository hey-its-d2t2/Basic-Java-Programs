import java.util.Scanner;
class Array3DEg
{
	public static void main(String[] args) 
	{
		int a[][][];
		int rows,cols,i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows and columns of the Matrix:");
		rows=sc.nextInt();
		cols=sc.nextInt();
		a=new int[3][rows][cols];
		//Reading the elements of both Matrices
		for(k=0;k<2;k++)
		{
			System.out.println("Enter "+(rows*cols)+" elements of Matrix number "+(k+1)+":");
			for(i=0;i<rows;i++)
			{
				for(j=0;j<cols;j++)
				{
					a[k][i][j]=sc.nextInt();
				}
				System.out.println();
			}
		}
		//Adding the matrices
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
					a[2][i][j]=a[0][i][j]+a[1][i][j];
			}
		}
		//Printing the elements of both Matrices
		for(k=0;k<3;k++)
		{
			System.out.println("Matrix number "+(k+1)+":");
			for(i=0;i<rows;i++)
			{
				for(j=0;j<cols;j++)
				{
					System.out.printf("%3d ",a[k][i][j]);
				}
				System.out.println();
			}
		}
	}
}