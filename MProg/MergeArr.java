class MergeArr 
{
	public static void main(String[] args) 
	{
		int arr1[] = new int[]{1,2,3,4,5};
		int arr2[] = new int[]{6,7,8,9,10};
		int arr3[] = mergeArr(arr1,arr2);

		for (int i=0;i<arr3.length ;i++ )
		{
			System.out.print(arr3[i]+" ");
		}
	}
		
	static int[] mergeArr(int arr1[], int arr2[])
	{
		int arr3[] = new int[arr1.length+arr2.length];
		for (int i=0;i<arr1.length ;i++ )
		{
			arr3[i] = arr1[i];
		}
		for (int i=0;i<arr2.length ;i++ )
		{
			arr3[arr1.length+i] = arr2[i];
		}
		return arr3;
	}
}
