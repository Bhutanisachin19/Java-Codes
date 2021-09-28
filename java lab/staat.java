class One
{
    static int s=1019;

    public static void disp()
    {
        System.out.println("Hello from One");
    }
}

class Two extends One
{
    //static int s;

    public static void dispp()
    {
        System.out.println("Hello from Two");
    }
}

class Defau
{
    public static void main(String []args)
    {
        //Two obj = new Two();
        Two.dispp();

        Two.disp();
        System.out.println(Two.s);
        //obj.disp();
    }
}
