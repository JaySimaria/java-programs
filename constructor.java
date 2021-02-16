class constructor
{
	 public static void main(String args[]);
	 {
		float length,breath;
		constructor(float l,float b); 
		{
				length=l;
				breath=b;
		}
		double area()
		{
				return length*breath;
		}
		void disp()
		{
			System.out.println("length="+length);
			System.out.println("breath="+breath);
		}
	 }	
}
class constructordemo
{
		public static void main(String args[])
		{
			constructor class1=new constructor(10,20);
			constructor class2=new constructor(20,30);
			class1.disp();
			class2.disp();
			System.out.println("area1="+class1.area());
			System.out.println("area2="+class2.area());
		}
}		
		