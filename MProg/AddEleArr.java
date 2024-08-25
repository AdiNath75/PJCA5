import java.util.Scanner;
class AddEleArr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Values" );
		for (int i=0;i<arr.length ;i++ )
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Element to be Add in Array");
		int ele = sc.nextInt();
		arr = addEle(arr,ele);
		
		for (int i=0;i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
		
		static int[] addEle(int arr[],int ele)
		{
			int temp[] = new int[arr.length+1];
			temp[temp.length-1] = ele;

			for (int i=0;i<temp.length-1 ; i++)
			{
				temp[i] = arr[i];
			}
			return temp;
		}

}
