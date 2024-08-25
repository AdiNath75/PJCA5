class PatternV {
	public static void main(String[] args) {
		
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				if (i==3 && j==3)
				{
					System.out.print("+ ");
				}
				else if(j==3)
				{
					System.out.print("| ");
				}
				else if(i==3)
				{
					System.out.print("- ");
				}
				else if (((i==0 ||  i==1 || i==2) && (j==4 || j==5 || j==6))
					||((i==4 || i==5 || i==6)&&(j==0 || j==1 || j==2)))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
