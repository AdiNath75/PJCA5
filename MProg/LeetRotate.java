class LeetRotate 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6,7};
		int ans[] = new int[arr.length];
		int k = 3;
		for (int i=0;i<k;i++ )
		{
			ans[i] = arr[arr.length-k+i];
		}
		int j=0;
		for (int i=k;i<arr.length ;i++ )
		{
			ans[i] = arr[j];
			j++;
		}
		for (int i=0;i<ans.length ;i++ )
		{
			System.out.print(ans[i]+" ");
		}

	}
}
