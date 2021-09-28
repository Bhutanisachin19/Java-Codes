/*
class Base
{
    public static void  m1()
    {
        System.out.println("hello Base");
    }
}


class Derived extends Base
{   

    //method hiding
    public static void  m1()
    {
        System.out.println("hello Derived");
    }

    
    public static void  hello()
    {
        System.out.println("hello Derived");
    }

}


class Tesssst
{
    public static void main(String [] a)
    {
        Derived obj = new Derived();
        obj.hello();
        obj.m1();
    }
}

*/




class Base
{
    public  void  m1()
    {
        System.out.println("hello Base");
    }
}


class Derived extends Base
{   

    public  void  m1()
    {
        System.out.println("hello Derived");
    }

    
    public void  hello()
    {
        System.out.println("hello Derived");
    }

    
    public static void main(String [] a)
    {
        Base obj = new Derived();
        //obj.hello();
        obj.m1();
    }


}


