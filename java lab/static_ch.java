class A
{
    static int b=7;
	/*
    public static void fun(int b)
    {
        System.out.println(b);
    }
	*/
    //int x;
}
class B extends A
{
  //static int b=8;
    static
    {
        b=9;
    }

    //int a;
    /*
    public static void fun(int b)  // hiding the parent class static method
    {
        System.out.println("Calling from child hiding method "+b);
    }
    */
}
class InheritTest
{
    public static void main(String []args)
    {
        B obj = new B();
        //System.out.println(B.b);
         B.fun(22);
    }
}