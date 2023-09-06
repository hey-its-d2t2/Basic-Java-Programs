class JaggedArrayEg
{
	public static void main(String[] args)
	{
		int i,j;
		int a[][]=new int[3][];
		a[0]=new int[]{4,2,6,5,8,7};
		a[1]=new int[]{1,2,3,4};
		a[2]=new int[]{1,2,3,4,5};
		for(i=0;i<3;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.printf("%3d ",a[i][j]);
			}
			System.out.println();
		}

	}
}