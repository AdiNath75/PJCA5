class Root 
{
	public static void root(int num)
	{
		int i;
		for ( i=1;i<num ;i++ )
		{
			if (num%i==0)
			{
				int root = i*i;
				if (num==root)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int num = 25;
		root(num);
	}
}
