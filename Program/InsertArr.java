import java.util.Scanner;
class InsertArr 
{
	static int[] insertArr(int ar[],int br[],int in)
	{
		if (in<0 || in>ar.length)
		{
			System.out.println("Index Not in Range");
			return ar;
		}
		int cr[]= new int [ar.length+br.length];
		for (int i=0;i<br.length ;i++ )
		{
			cr[in+i]=br[i];
		}
		for (int i=0;i<ar.length ;i++)
		{
			if (i<in)
			{
				cr[i]=ar[i];
			}
			else
				cr[i+br.length]=ar[i];
		}
		return cr;
	}
	public static void main(String[] args) 
	{
		int a[]={13,24,37,46}; 
		int b[]={25,28,32,45}; 
		int c[]=insertArr(a,b,2); 
		for(int i=0;i<c.length;i++) 
		{
			System.out.print(c[i]+" ");//13 24 25 28 32 37 45 46 52 
		}
	}
}
