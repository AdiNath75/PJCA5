import java.util.Scanner;
class MergeArr2
{
	static int[] merge(int a[],int b[])
	{
		int c[]= new int[a.length+b.length];
		for (int i=0;i<a.length ;i++ )
		{
			c[i]=a[i];
		}
		for (int j=0;j<b.length ;j++ )
		{
			c[a.length+j]=b[j];
		}
		return c;
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
	public static void main(String[] args) 
	{
		System.out.println("Read First Array");
		int x[]=readArr();
		System.out.println("Read Second Array");
		int y[]=readArr();
		int z[]=merge(x,y);
		System.out.println("User Entered First Array");
		dispArr(x);
		System.out.println("User Entered Second Array");
		dispArr(y);
		System.out.println("After Merge of Two Array");
		dispArr(z);
	}
}