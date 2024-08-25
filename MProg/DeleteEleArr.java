class DeleteEleArr 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[]{1,2,5,5,2};
		int index = 2;
		arr = deleteEle(arr, index);
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.print(arr[i]+" ");
		}
	}
	static int[] deleteEle(int arr[], int index)
	{
		int temp[] = new int[arr.length-1];
		for (int i=0;i<temp.length;i++ )
		{
			if (i<index)
			{
				temp[i] = arr[i];
			}
			else
			{
				temp[i] = arr[i+1];
			}
		}
		return temp;
	}
}
