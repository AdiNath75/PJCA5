class AddElePos 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[]{1,5,5,58,5};
		int ele = 2;
		int index = 3;
		arr = addElePos(arr,ele,index);

		for (int i=0;i<arr.length ;i++ )
		{
			System.out.println(arr[i]+" ");
		}
	}

		static int[] addElePos(int arr[],int ele, int index)
		{
			int temp[] = new int[arr.length+1];
			temp[index] = ele;
			for (int i=0;i<temp.length-1 ;i++ )
			{
				if (i<index)
				{
					temp[i] = arr[i];
				}
				else
				{
					temp[i+1] = arr[i];
				}
			}
			return temp;
		}
}
