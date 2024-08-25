import java.util.Scanner;
class CountNumDigit 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Value");
		int num = s.nextInt();
		int dcount = 0;
		do{
			dcount++;
			num = num/10;
		}while(num!=0);
		System.out.println("Number of Digit of number: "+dcount);
	}
}
