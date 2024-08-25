import java.util.Scanner;
class ReverseArr 
{
	public static void main(String[] args) 
	{
		int x[]=readArr();
		System.out.println("Before Reverse");
		dispArr(x);
		System.out.println("After Reverse");
		reverse(x);
		dispArr(x);
	}
	static int[] readArr()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int n =s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" values");
		for (int i=0;i<ar.length ;i++ )
		{
			ar[i]=s.nextInt();
		}
		return ar;
	}
	static void dispArr(int []ar)
	{
		for (int i=0;i<ar.length ;i++ )
		{
			System.out.println(ar[i]+" ");
		}
		System.out.println();
	}
	static void reverse (int []a)
	{
		for (int i=0;i<a.length/2 ;i++ )
		{
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
	}
}
