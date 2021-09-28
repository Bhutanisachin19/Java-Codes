class A
{
    public A()
    {
        System.out.println("A");
    }
    
    public A(int a)
    {
        System.out.println("A with parameter");
    }
}

class B extends A
{
    public B()
    {
        super(10);
        System.out.println("B");
    }
}
class Test
{
    public static void main(String[] args)
    {
        B ob = new B();

    }
}