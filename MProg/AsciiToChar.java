class AsciiToChar 
{
	public static void main(String[] args) 
	{
		int start = 0, end = 127;
		for (int i=start;i<=end ;i++ )
		{
			char ch = (char)(i);
			System.out.println("ASCII value of Character "+ch+" is "+i);
		}
	}
}
