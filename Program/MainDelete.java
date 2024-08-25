//define merge two sorted array in to single array 
class MainDelete 
{
	static int[] deleteArr(int x[],int in) 
	{
		if(in<0||in>=x.length) 
		{
			System.out.println("index not in the range"); 
			return x;
		} 
		int y[]=new int[x.length-1]; 
		for(int i=0;i<y.length;i++)
		{
			if(i<in)
				y[i]=x[i]; 
			else
				y[i]=x[i+1];
		} 
		return y; 
		}
	public static void main(String arg[])
	{
		int a[]={13,24,37,46,52};
		a= deleteArr(a,2); 
		for(int i=0;i<a.length;i++) 
		{ 
			System.out.print(a[i]+" ");//13 24 46 52 
		}
	}
}