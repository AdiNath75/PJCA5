class String1
{
	public static void main(String[] args)
	{
		String st ="";
		for (int i=0;i<=5 ;i++ )
		{
			st=st+i;
		}
		System.out.println(st);
		for (int i=0;i<=5 ;i++ )
		{
			st=i+st;
		}
		System.out.println(st);
	}
}