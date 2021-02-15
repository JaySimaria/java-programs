// Java program to demostrate the use of parameterised constructor
class Student4
{
	int id;
	String name;
	//creating a parameterised constuctor
	 Student4(int i,String n)
	 {
		id = i;
		name = n;
	 }
	//method to display to values 
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		//creating the obiject by passing values
		Student4 s1=new Student4(111,"Shakshi");
		Student4 s2=new Student4(222,"Mihir");
		// calling method to display the values of object
		s1.display();
		s2.display();
	}
}	