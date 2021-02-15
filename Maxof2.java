import java.util.Scanner;
class Maxof2
{
	public static void main(String args[])
	{
		//scanner class declaration
		Scanner scan=new Scanner(System.in);
		//input first number
		System.out.println("enter the first number:");
		int first=scan.nextInt();
		//input second number
		System.out.println("enter the second number:");
		int second=scan.nextInt();
		//conditions
		if(first>second)
		{
				System.out.println(first+" is greater than "+second);
	    }		
		else if(second>first)
		{	
				System.out.println(second+"is greater than"+first);
		}		
		else
		{
				System.out.println("both numbers are equal");
		}		
		scan.close();		
	}	
}	
	