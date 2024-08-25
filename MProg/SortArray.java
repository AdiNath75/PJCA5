class SortArray 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[]{4,5,8,5,4,7};
		int arr1[] = sortArr(arr);
		
		for (int i=0;i<arr1.length ;i++ )
		{
			System.out.println(arr1[i]);
		}
	}
		static int[] sortArr(int arr[])
		{
			
			int max = 0;
				for (int i=0;i<arr.length ;i++ )
				{
					for (int j=i+1;j<arr.length ;j++ )
					{
						if (arr[i] > arr[j])
						{
							max = arr[i];
							arr[i] = arr[j];
							arr[j] = max;
						}
					}
				}
			return arr;
		}
	
}
