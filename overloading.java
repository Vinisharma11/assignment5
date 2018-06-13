
class information
{  
	public static void print(int i)
	{
		System.out.println(i);
    }
   public static void print(float r)
    {
    	System.out.println(r);
    }
    public static void print()
    {
    	System.out.println(" method overloading");
    }
	 public static void main(String [] args)
	 {
	 	print(10);
	 	print(14.5f);
	 	print();
	 }
}