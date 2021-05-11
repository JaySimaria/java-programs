import java.util.Random;

class RandomNumbers
{
	public static void main(String args[])
	{
		Random ObjGenerator = new Random();
		for(int iCount=0; iCount<10; iCount++)
		{
			int randomNumber = ObjGenerator.nextInt(100);
			System.out.println("Random No : " + randomNumber);
		}	
	}
}	