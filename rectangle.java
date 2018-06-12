import java.util.Scanner;
class rectangle
{
	public static int area(int length,int breadth)
	{
		  int ar=length*breadth;
         return(ar);
	}
}
class tangle
{ 
	public static void main(String args[])
	{
  
	Scanner sc= new Scanner(System.in);
    System.out.println("enter lentgh");
	int len= sc.nextInt();
    System.out.println("enter breadth");
    int brd=sc.nextInt();
    rectangle r = new rectangle();
    int areaofrectangle=r.area(len, brd);
    System.out.println("area ="+areaofrectangle);
    }
}
