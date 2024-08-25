class  AvgAndGreater
{
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50,60};
		int sum = 0;
		int i;
		for ( i=0;i<arr.length ;i++ )
		{
			sum = sum + arr[i];
		}
		double avg = sum/i;
		for (i=0;i<arr.length ;i++ )
		{
			if (arr[i]>avg)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
