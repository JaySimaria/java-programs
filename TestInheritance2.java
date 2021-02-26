class Animal
{
	Void eat()
	{
		System.out.prinln("Eating...");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
class BabyDog extends Dog
{
		void weep()
		{
			System.out.println("Weeping...");
		}
}
class TestInheritance2
{
		Public static void main(String args[])
		{
			BabyDog d=new BabyDog();
			d.weep();
			d.bark();
			d.eat();
		}
}		