class FreqArray
{
	public static void main(String[] args) 
	{
		int arr[] = new int[]{1,2,3,4,2,5,1,5,2,4,5,2,4,5};
		int max = 0;
		for (int i=0;i<arr.length ;i++ )
		{
			if (arr[i]>max)
			{
				max = arr[i];
			}
		}
		int count[] = new int[max+1];
		for (int i=0;i<arr.length ;i++ )
		{
			count[arr[i]]++;
			
		}
		for (int i=0;i<count.length ;i++ )
		{
			if (count[i]!=0)
			{
				System.out.println(i+"------"+count[i]);
			}
		}

	}
}
