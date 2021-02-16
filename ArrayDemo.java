class ArrayDemo
{
	public static void main(String args[])
	{
		int sub[];
		sub= new int[3];
		sub [0]=75;
		sub [1]=82;
		sub [2]=88;
		int total=0;
		for(int i=0;i<3;i++)
		{
		      total=total+sub[i];
			  System.out.println("sub["+i+"]="+sub[i]);
		}
		System.out.println("sum of marks ="+total);
	}
}	
		