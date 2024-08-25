class CumulativeSum 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,-5,9,-8,5,4,5,-11,2,8,5};
		int sum = 0;
		for (int i=0;i<arr.length ;i++ )
		{
			sum = arr[i]+sum;
			System.out.print(sum+" ");
		}
		
	}
}
