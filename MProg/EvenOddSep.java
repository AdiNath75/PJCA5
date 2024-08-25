class  EvenOddSep
{
	public static void main(String[] args) 
	{
		int arr[] = new int[]{1,4,7,2,6,8,9,5,3};
		int ec = 0, oc = 0;
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
		int even[] = new int[ec];
		int odd[] = new int[oc];
		int j=0,k=0;
		for (int i=0;i<arr.length ;i++ )
		{
			if (arr[i]%2==0)
			{
				even[j]=arr[i];
				j++;
			}
			else
			{
				odd[k]=arr[i];
				k++;
			}
		}
		
		for (int i=0;i<even.length ;i++ )
		{
			System.out.print(even[i]+" ");
		}
		System.out.println();
		for (int i=0; i<odd.length;i++ )
		{
			System.out.print(odd[i]+" ");
		}
	}
}
