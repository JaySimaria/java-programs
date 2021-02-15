// Check if sum of two numbers is greater, equal to or less than ten.
import java.util.Scanner;

class IfElseBranching
{
	public static void main(String args[])
	{
		int a, b;
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		if((a+b)==10)
		{
			System.out.println("value of a+b is equal to 10");
		}
		else if((a+b)<10)
		{
				System.out.println("value of a+b is less than 10");
		}
		else
		{
				System.out.println("value of a+b is greater than 10");
		}
	}
}	
			
		