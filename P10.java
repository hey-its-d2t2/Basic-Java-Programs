/*
54321
5432
543
54
5
*/

class P10
{
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j= 5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}