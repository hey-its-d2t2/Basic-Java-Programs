class IP
{
	public static void main(String[] args) {
		
			pattern2(4);
	}

/*
******
 ***
  *
 ***
******
*/
	static void pattern(int n)
	{
		for (int i=0;i<=n ;i++ )
		{

			
		}

	}

/*
   *   
  ***
 *****
*******

*/
	static void pattern2(int row)
	{
		for (int i = 1; i <= row; i++) 
        { 
            for (int j = row; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}