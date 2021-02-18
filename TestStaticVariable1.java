// java program to demonstrate the use of static variable
class Student
{
	int rollno;
	//instance variable
	String name;
	static String college="NJS";
	//static variable
   // constructor
   Student(int r,String n)
   {
		rollno=r;
		name=n;
   }
     //method the diaplay the values
     void display()
     {
	     System.out.println(rollno+" "+name+" "+college);
     }
 }
//test class to show the values of objects
class TestStaticVariable1
{
	public static void main(String args[])
	{
		Student s1=new Student(111,"Dipak");
		Student s2=new Student(222,"Chirag");
		//we can change the college of all objects by the single line of code
		//Student.college="N.J.SONECHA";
		s1.display();
		s2.display();
	}
}	