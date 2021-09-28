
//writing a function that can take any type as a argument

class Demo_Para
{
    public static void fun_try(Object o)
    {
        if(o instanceof Integer)
            System.out.println("Integer");
        else if(o instanceof Float)
            System.out.println("Float");
        else if(o instanceof String)
            System.out.println("String");
        else if(o instanceof Double)
            System.out.println("Double");
        else if(o instanceof Long)
            System.out.println("Long");
        else 
            System.out.println("I dont know");
    }

    public static void main(String[] args)
    {
        int a =10;
        float f =20.5f;
        double d = 10.5;
        String name = "Messi";

        fun_try(name);
    }
}