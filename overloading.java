class age
{
	public static void info(int age)
	{
     System.out.println("age:"+age);
	}
}
class score
{
     public static void info(float percent)
     {
		System.out.println("percentage:"+percent);
	 }
}
class information
{
	 public static void info()
	 {
	 	System.out.println("student detail");
	 	System.out.println("name: Vinita");
	 }
	 public static void main(String [] args)
	 {
	 	age a= new age();
	 	score s= new score();
	 	info();
	 	a.info(20);
	 	s.info(89.6);
	 }
}