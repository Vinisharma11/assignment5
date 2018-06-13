import java.util.*;
 
class subarray{
    public static int lengthofsub(int a[], int length)
    {
        int max = 1, len = 1;
        for (int i=1; i<length; i++)
        {
            if (a[i] > a[i-1])
                len++;
            else
            {
                if (max < len)    
                    max = len; 

                len = 1;    
            }    
        }

        if (max < len)
            max = len;

        return max;
    }
    public static void main(String[] args) 
    {    
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter no. of elements you want in array:");
          int n = sc.nextInt();
          int a[] = new int[n];
          System.out.println("Enter all the elements:");
          for (int i = 0; i < n; i++) 
          {
            a[i] = sc.nextInt();
          }
         int length=a.length;
            System.out.println("Length = " + lengthofsub(a, length));
         
        }
    }