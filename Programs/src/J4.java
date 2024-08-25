class J4 
{
	public static void main(String[] args) 
	{
		int evesum = 0, oddsum = 0;
		int num = 1234;
		while (num!=0)
		{
			int rem = num%10;
			if (EvenOdd.even(rem))
			{
				evesum += rem;
			}
			else
			{
				oddsum += rem;
			}
		}
		System.out.println("Sum of Even Digit is :"+evesum);
		System.out.println("Sum of Odd Digit is :"+oddsum);
	}
}
