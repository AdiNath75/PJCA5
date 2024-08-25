class  SortArray1
{
	public static void main(String[] args) 
	{
		int arr[] = new int[]{10,20,40,50,20,10,30,25};
		int max1 = 0;
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=i+1;j<arr.length ;j++ )
			{
				if (arr[i]>arr[j])
				{
					max1 = arr[i];
					arr[i] = arr[j];
					arr[j]= max1;
				}
			}
		}
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.println(arr[i]+" ");
		}
		
	
	}
}
