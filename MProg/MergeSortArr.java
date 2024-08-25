class MergeSortArr
{
	public static void main(String[] args) 
	{
		int a[]={13,24,37,46,52}; 
		int b[]={25,28,32,45}; 
		int c[] = MergeArr.mergeArr(a,b);
		int d[] = SortArray.sortArr(c);

		for (int i=0;i<d.length ;i++ )
		{
			System.out.println(d[i]);
		}

		
	}
}
