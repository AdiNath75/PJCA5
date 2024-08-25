class RightRotateArray 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[]{1,2,3,4,5};
		int n = 1;
		for (int i=0;i<n ;i++ )
		{
			int first = arr[arr.length-1];
			int j;
			for (j=arr.length-1;j>0 ;j-- )
			{
				arr[j]=arr[j-1];
			}
			arr[0]=first;
		}
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.println(arr[i]+" ");
		}
		
	}
}