import java.util.Scanner;
class  ArrayDisp
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];
		a[0]=s.nextInt();
		a[1]=s.nextInt();
		a[2]=s.nextInt();
		a[3]=s.nextInt();
		a[4]=s.nextInt();
		for (int i=0;i<a.length ;i++ )
		{
			System.out.println(a[i]);
		}
		int arr[] = {14,52,8,57,5,85};
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.println(arr[i]);
		}
	}
}
