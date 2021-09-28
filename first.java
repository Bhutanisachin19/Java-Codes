
class One
{
    int a; // def value 0
    static int s; // def value 0
    public static void main(String[] args)
    {
        One obj = new One();
        System.out.println(obj.a);

        System.out.println(One.s);
    }
}