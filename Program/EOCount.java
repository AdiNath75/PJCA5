class EOCount
{
	static int[] countEO(int x[])
	{
		int ec=0,oc=0;
		for (int i=0;i<x.length ;i++ )
		{
			if (x[i]%2==0)
			{
				ec++;
			}
			else
				oc++;
		}
		int count[]={ec, oc};
		return count;
	}
	public static void main(String arg[])
	{
		int a[]={13,24,37,46,52};
		int c[]=countEO(a);
		System.out.println("Number of Even Count is :"+c[1]);
		System.out.println("Number of Odd Count is :"+c[0]);
	}
}