
class A
{
    int a = 10;
    static int s = 19;

    public void disp()
    {
        System.out.println("Disp of A");
    }
}

class B extends A
{
    //int b;
    
    public void disp()
    {
        System.out.println("Disp of B  " +s); //can access static in java
    }
}

class Try
{
    public static void main(String[] args)
    {
        /*
        B obj = new B();
        obj.disp();
        */
    }
}