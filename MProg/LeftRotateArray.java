class LeftRotateArray 
{
	public static void main(String[] args) 
	{
		int arr[] =new int[]{14,5,8,9,4,61,5,42,8,2};
		int n =1;
		for (int i=0;i<n ;i++ )
		{
			int j;
			int first = arr[0];
			for ( j=0;j<arr.length-1 ;j++ )
			{
				arr[j]=arr[j+1];
			}	
			arr[j]=first;
			
		}
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.print(arr[i]+" ");
		}

	}
}
