abstract class One
{
    int a;
    void hello()
    {
        System.out.println("Hello from abstract "+a);
    }
}

class Two extends One
{
    void hel()
    {
        System.out.println("Hello from class");
    }
    public static void main(String []args)
    {
        Two obj = new Two();
        obj.hel();
        obj.hello();
    }
}