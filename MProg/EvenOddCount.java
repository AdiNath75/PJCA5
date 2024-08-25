class EvenOddCount 
{
	public static void main(String[] args) 
	{
		int arr[] = {4,5,8,9,7,10};
		int ec = 0,oc = 0;

		for (int i=0;i<arr.length ;i++ )
		{
			if (arr[i]%2==0)
			{
				ec++;
			}
			else
			{
				oc++;
			}

		}
		System.out.println(ec);
		System.out.println(oc);
	}
}
