// annotation for functional interface

//functional interface -> which has only one abstract method


@FunctionalInterface

interface inter1
{
    void method_one();
    //void hello();  //if we uncomment this it will result in compilation error because it will not be a functional interface and we are using annotation

    //can access this method by creating a class which will inherit the interface
    default void method_inter()
    {
        System.out.println("hello from interface");
    }
}

class Annotation_demo2 implements inter1
{
    public void method_one()
    {
        System.out.println("Hello from Demo 2");
    }

    public void hello()
    {
        System.out.println("Hello method");
    }

    public static void main(String[] args)
    {
        /*
        Annotation_demo2 obj = new Annotation_demo2();
        obj.method_one();
        obj.hello();
        */
            
        inter1 in = new Annotation_demo2();
        in.method_one();
        in.method_inter();
    }
}