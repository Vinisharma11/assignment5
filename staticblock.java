class staticblock {
    static int i;
    int j=20;
    static 
    {
        i=10;
        System.out.println("static block initializes the class ");
        System.out.println("it will be executed once only");
    }

    void sum()
    {
     int sum=i+j;
        System.out.println("sum="+sum);
    }
}
 
class stats
 {
    public static void main(String args[]) {
        staticblock s=new staticblock();
        System.out.println(s.i); 
        s.sum();
    }
}