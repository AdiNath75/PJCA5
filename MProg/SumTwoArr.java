class SumTwoArr 
{
	public static void main(String[] args) 
	{
		int arr1[] = new int[]{1,2,3,4,5};
		int arr2[] = new int[]{9,8,7,6,5};
		int sum[] = new int[arr1.length];
		for (int i=0;i<sum.length;i++ )
		{
			sum[i] = arr1[i]+arr2[i];
		}
		for (int i=0;i<sum.length ;i++ )
		{
			System.out.print(sum[i]+" ");
		}
	}
}
