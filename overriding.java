import java.util.Scanner;
class cat extends animal
{
 public static void speak()
 {  
 	System.out.println("IN CLASS CAT");
 	System.out.println("meow");
 	System.out.println(" ");
 }
}
class dog extends animal
{
	public static void speak()
 {
 	System.out.println("IN CLASS DOG");
 	System.out.println("bark");
 	System.out.println(" ");
    
}
}
class animal
{
  	public static void speak()
   { 
   	System.out.println("IN CLASS ANIMAL");
 	System.out.println("cats meow");
 	System.out.println("dogs barks");
 	System.out.println("bird chirps");
 	System.out.println("cow moo");
 	System.out.println("horse neigh");
 	System.out.println(" ");
   }
}
class overriding
{
  public static void main(String []args)
  {  
    animal a = new animal();
    dog d = new dog();
    cat c = new cat();
    a.speak();
    d.speak();
    c.speak();
 }
}