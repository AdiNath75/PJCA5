class  SecMaxArr
{
	public static void main(String[] args) 
	{
		int arr[] = new int[]{10,20,40,50,30,25};
		int max1 = 0;
		int max2 = 0;
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
		System.out.println(arr[arr.length-3]);
		
	
	}
}
