class PrintStudentGrade
{
	public static void main(String args[])
	{
		int marks= 65;
		if(marks>75)// Condition A
		{
			System.out.println("Distinction");// Line A
		}
		else if(marks>50 && marks<=60)// Condition C
		{
			System.out.println("Second class"); //Line C
		}
		else if(marks>60 && marks<=75)// Condition B
		{
			System.out.println("First Class");//Line B
		}
		else
		{
			System.out.println("Fail"); //Line D
		}
	}
}	