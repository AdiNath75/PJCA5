import java.util.Scanner;
class IfElseIf3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Month Number");
		int month = s.nextInt();
		if (month >0 && month <13)
		{
			if (month==12 || month==1)
			
				System.out.println("Winter Season");
			
			else if (month==2 || month==3)
			
				System.out.println("Spring Season");
			
			else if (month==4 || month==5 || month==6)
			
				System.out.println("Summer Season");
			
			else if (month==7 || month==8 || month==9)
			
				System.out.println("Monsoon Season");
			
			else if (month==10 || month==11)
			
				System.out.println("Auntum Season");
			
		}
		else
		{
			System.out.println("Invalid Month");
		}
			
	}
}
