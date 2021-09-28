


class Parent_doubt
{
    static void hello1()
    {
        System.out.println("Hello from Parent");
    }
}

class Child_doubt extends Parent_doubt
{
    static void hello1()
    {
        System.out.println("Hello from Child");
    }

    public static void main(String[]  args)
    {
        Parent_doubt p1 =new Parent_doubt();
        p1.hello1();

        Child_doubt c1 = new Child_doubt();
        c1.hello1();


        
        //if remove static from methods then its called overriding and child method is executed
        Parent_doubt p2 =new Child_doubt();
        p2.hello1(); //parent

    }
}