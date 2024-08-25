class CompareArr 
{
	public static void main(String[] args) 
	{
		int arr1[] = new int[]{1,2,3,4,5};
		int arr2[] = arr1;
		int arr3[] = new int[]{9,8,7,6,5};
		
		if (arr1 == arr2)
		{
			System.out.println("The arrays 1 & 2 are same");
		}
		else
		{
			System.out.println("The arrays 1 & 2 are not same");
		}
		if (arr2 == arr3)
		{
			System.out.println("The arrays 2 & 3 are same");
		}
		else
		{
			System.out.println("The arrays 2 & 3 are not same");
		}
		if (arr1 == arr3)
		{
			System.out.println("The arrays 1 & 3 are same");
		}
		else
		{
			System.out.println("The arrays 1 & 3 are not same");
		}
	}
}
