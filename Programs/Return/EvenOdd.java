class EvenOdd 
{
	public static int even(int num)
	{
		if (num%2==0)
		{
			return num;
		}
	}
	public static void main(String[] args) 
	{
		int num = 1234;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem = i%10;
			if (even(i))
			{
				evensum += rem;
			}
			else
			{
				oddsum += rem;
			}
		}
		System.out.println("Sum of even digit is "+evensum);
		System.out.println("Sum of odd digit is "+oddsum);
	}
}
