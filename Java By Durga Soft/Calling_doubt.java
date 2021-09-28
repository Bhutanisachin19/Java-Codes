class Parent
{
    public void abc()
    {
        System.out.println("abc from parent");
    }

    public void Hello()
    {
        System.out.println("Hello from parent");
        abc(); // calls  child method if exist else parents
    }
}

class Child extends Parent
{
    /*
    public void abc()
    {
        System.out.println("abc from child");
    }
    */

    public void abcd()
    {
        System.out.println("abc from child");
    }

}

class Both
{
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.Hello();
    }
}