/*
interface inter1
{
    void h1();
    void h2();
}


class Final_obj implements inter1
{
    public void h1()
    {
        System.out.println("Hello 1");
    }

    public void h2()
    {
        System.out.println("Hello 2");
    }

    public void h3()
    {
        System.out.println("Hello 3");
    }
    
    
    public static void main(String[] args)
    {

        inter1 obj = new Final_obj();
        obj.h1();
        obj.h2();
        //obj.h3();

    }
}

*/



class Demo_demo
{
    int a = 10;
    public static void main(String[] args)
    {
        //final String name  = new String("Sachin"); //error because final means cannot be changed
        //name = name + " Bhutani";
        //System.out.println(name);

        final Demo_demo obj = new Demo_demo();
        System.out.println(obj.a);

        obj.a = obj.a + 10; //final but we can still change it because final object mean it cannot reffer to another object
        System.out.println(obj.a);

    }
}