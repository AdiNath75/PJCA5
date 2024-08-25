//define merge two sorted array in to single array 
class MainMerge
{
	static int[] mergeS(int []x,int []y)
		{
		int z[]=new int[x.length+y.length]; 
		int i=0,j=0,k=0;
		while(i<x.length&&j<y.length) 
		{
			if(x[i]<y[j])
			{ 
				z[k]=x[i]; 
				i++;
			}
			else 
			{
				z[k]=y[j];
				j++; 
			} 
			k++;
		}
		while(i<x.length)
		{ 
			z[k]=x[i];
			i++; 
			k++;
		} 
		while(j<y.length)
		{ 
			z[k]=y[j]; j++; k++; 
		}
		return z; 
		}
	public static void main(String arg[])
	{
		int a[]={13,24,37,46,52}; 
		int b[]={25,28,32,45}; 
		int c[]=mergeS(a,b); 
		for(int i=0;i<c.length;i++) 
		{
			System.out.print(c[i]+" ");//13 24 25 28 32 37 45 46 52 
		}
	}
}