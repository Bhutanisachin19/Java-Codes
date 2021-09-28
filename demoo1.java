
class C1  implements int2
{
    public void a1()
    {
        System.out.println("hello 1");
    }

    
    public void a2()
    {
        System.out.println("hello 2");
    }

    public static void main(String [] args)
    {
        C1 obj = new C1();
        obj.a2();
        obj.a1();
    }
}



interface int2
{
    void a2();
}

interface int1 extends int2 
{
    void a1();
}