class Remove 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[]{31,18,31,0,4,6,7,18};
		
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length ;j++ )
			{
				if (arr[i]==arr[j])
				{
					arr = deleteEle(arr,j);
					j--;
				}
			}
		}
		for (int i=0;i<arr.length ;i++)
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
