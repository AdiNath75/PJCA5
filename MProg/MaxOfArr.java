import java.util.Scanner;
class MaxOfArr 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" values");
		int max = arr[0];
		for (int i=0;i<arr.length ;i++ )
		{
			arr[i] = s.nextInt();
			if (max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("The Max element from given Array is : "+max);
	}
}
