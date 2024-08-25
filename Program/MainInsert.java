 class MainInsert 
{
	static int[] insertArr(int x[],int in, int ele) 
	{
		if(in<0||in>=x.length) 
		{
			System.out.println("index not in the range"); 
			return x;
		} 
		int y[]=new int[x.length+1];
		y[in]=ele;
		for(int i=0;i<x.length;i++)
		{
			if(i<in)
				y[i]=x[i]; 
			else
				y[i+1]=x[i];
		} 
		return y; 
		}
	public static void main(String arg[])
	{
		int a[]={13,24,37,46,52};
		a = insertArr(a,2,39); 
		for(int i=0;i<a.length;i++) 
		{ 
			System.out.print(a[i]+" ");//13 24 37 39 46 52 
		}
	}
}