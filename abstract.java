abstract class animal
{
  int age;
 abstract void method();
 void speak()
 {
	 System.out.println("barking dogs seldom bites");
 }
}
class dog extends animal
{
 void method()
 {
	 age=10;
	 System.out.println("my dogs age is "+age);
 }	 
}
class main2
{
	public static void main( String args[])
	{
		dog d= new dog();
		d.method();
		d.speak();	
	}
}