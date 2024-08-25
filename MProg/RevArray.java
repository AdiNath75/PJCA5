class RevArray 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[]{10,20,3,01,25,2,6,5};
		int arr1[] = new int[arr.length];
		int n = arr.length;
		for (int i=0;i<arr.length ;i++ )
		{
				arr1[n-1-i] = arr[i];
			
		}
		for (int i=0;i<arr1.length ;i++ )
		{
			System.out.print(arr1[i]+" ");
		}
		
	}
}
