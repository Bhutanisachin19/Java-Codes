//annotation for overriding

// while using annotation if we do not override properly it gives complietime error

class Parent
{
    public void Hello()
    {
        System.out.println("Hello from parent class");
    }
}



class Child extends Parent
{
    public void Hello1()
    {
        System.out.println("Hello from Child class");
    }

    @Override
    public void Hello()
    {
        System.out.println("Hello from Child OVERRIDDEN");
    }

    public static void main(String[] args)
    {
        Parent p1 = new Parent();
        p1.Hello();


        Child c1 = new Child();
        c1.Hello1();

        System.out.println("Calling parents hello method");
        c1.Hello();

    }
}
