class Triangle 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<5 ;j++ )
			{
				if ((i+j)>=6)
				{
					System.out.print(i+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(i+" ");
			}
		System.out.println();
		}
	}
}
