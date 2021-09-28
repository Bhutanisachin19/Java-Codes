//trying to override final method



class Parent1
{
    //final
    //adding final here will give error
    void Hello()
    {
        System.out.println("Hello from parent class");
    }
}



class Child1 extends Parent1
{

    void Hello()
    {
        System.out.println("Hello from Child OVERRIDDEN not final");
    }

    public static void main(String[] args)
    {
        Parent1 p1 = new Parent1();
        p1.Hello();


        Child1 c1 = new Child1();

        //System.out.println("Calling parents hello method");
        c1.Hello();

    }
}
