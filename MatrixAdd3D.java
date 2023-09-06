/**MatrixAdd3D*/
import java.util.Scanner;
class MatrixAdd3D
{
	public static void main(String[] args) 
	{
		int rows,cols,i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the total no. of rows & columns of the Matrix:");
		rows=sc.nextInt();
		cols=sc.nextInt();
		int a[][][]=new int[3][rows][cols];
		//input
		for(k=0;k<2;k++)
		{
			System.out.println("Input Matrix "+(k+1)+":");	
			for(i=0;i<rows;i++)
			{
				for(j=0;j<cols;j++)
				{
					a[k][i][j]=sc.nextInt();
				}
			}
			//System.out.println();
		}
		//process
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
					a[2][i][j]=a[0][i][j]+a[1][i][j];
			}
		}
		//Output
		for(k=0;k<3;k++)
		{
			System.out.println("Matrix "+(k+1)+":");	
			for(i=0;i<rows;i++)
			{
				for(j=0;j<cols;j++)
				{
					System.out.printf("%3d ",a[k][i][j]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
