class F_parent
{
    //inherited but cannot be overridden
    final void disp()
    {
        System.out.println("Parent");
    }
}


class Derived extends F_parent
{
    //Error -> Cannot override final method
    /*
    void disp()
    {
        System.out.println("Child");
    }
    */

    public static void main(String[] args)
    {
        Derived obj = new Derived();
        obj.disp();
    }
}