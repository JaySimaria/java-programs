class LogicDemo
{
	public static void main(String args[])
	{
		int a=15,b=30,c=15,d=30;
		if(a==c && b==d)
			System.out.println("Equal");
		else
			System.out.println("NotEqual");
		if(a<b || a<c)
			System.out.println("a is smaller than any other values");
		else
			System.out.println(" ais greater than any other values");
		if(a!=b)
			System.out.println("the value of a and b are not equal");
		else
			System.out.println("the value of a and b are equal");
	}
}	