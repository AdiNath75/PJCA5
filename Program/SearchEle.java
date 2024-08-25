import java.util.Scanner;
class SearchEle 
{
	static int searchArr(int x[], int ele)
	{
		for (int i=0;i<x.length ;i++ )
		{
			if (x[i]==ele)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int n=s.nextInt();
		int ar[]=new int [n];
		System.out.println("Enter" +n+" values");
		for (int i=0;i<ar.length ;i++ )
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter value to Search in Array");
		int v =s.nextInt();
		
		int in=searchArr(ar,v);
		if (in==-1)
		{
			System.out.println("Element is not there");
		}
		else
			System.out.println("Element present at: "+in);
	}
}
