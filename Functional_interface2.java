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

class functional_int
{
    public static void main(String[] args)
    {
        inter1 obj = () -> System.out.println("Hello from lambda ");
        obj.method_one();
        obj.method_inter();
    }
}