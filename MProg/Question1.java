class  Question1
{
	public static void main(String[] args) 
	{
		int start = 33, end = 999;
		int a = 0, b =0 , c= 0;
		for (int i =start;i<1000 ;i++ )
		{
			if (i%3==0 && i%5==0)
			{
				System.out.println(i+" : Pink & Yellow");
				c++;
			}
			else if (i%3==0)
			{
				System.out.println(i+" : Pink");
				a++;
			}
			else if (i%5==0)
			{
				b++;
				System.out.println(i+" : Yellow");
			}
		}
		System.out.println("Pink : "+a+", Yellow : "+b+" & Pink & Yellow : "+c );
		
	}
}
