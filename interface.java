interface animal
{
void speaks();
void eats();
}
class dog implements animal
{
	public void speaks()
	{
		System.out.println("dog barks");
	}
	public void eats()
	{
	   System.out.println("dogs eat bones");
	   System.out.println("dogs drinks milk");
	   
	}
	
}
class cat implements animal
{
	public void speaks()
	{
		System.out.println("cat meow");
	}
	public void eats()
	{
	   System.out.println("cat eats fish");
	   System.out.println("cats drinks milk");
	}
}
class main
{
	public static void main(String [] args)
	{
		dog d= new dog();
		cat c= new cat();
		c.speaks();
		d.speaks();
		c.eats();
		d.eats();
	}
	
	
}

