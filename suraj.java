/*
class Demo
{
    Demo()
    {
        
        this(10);
        System.out.println("Hello");
        
    }

    public void m1()
    {
        System.out.println("m1");
    }

     static void m2()
    {
        System.out.println("m2");
        //this.m1();
    }

    //instance block
    {
        System.out.println("Instance Block");
    }
    
    
    Demo(int a)
    {
        System.out.println("Int");
    }

    public static void main(String [] args)
    {
        Demo obj = new Demo();
        m2();

        Demo obj2 = new Demo();

    }
}

*/



class A
{
    public void disp()
    {
        System.out.println("A");
    }
}

interface B
{
    void disp();
}


class C extends A implements B
{
    public void disp()
    {
        System.out.println("C");
    }

    public static void main(String[] args)
    {
        C obj = new C();
        obj.disp();
    }
}







/*

class Parent
{
    Parent()
    {
        System.out.println("hello from parent");
    }

}


class Child extends Parent
{
    Child()
    {   
    }

    public static void main(String[] args)
    {
        Child obj = new Child();
    }
}

*/












