
class Divby
{
    public static void main(String[] args)
    {
        int i = 10;
        byte b = 10;
        short s = 10;
        //float f = 133.5616f;
        //double d = 145.3534d;
        float f = 10f;
        double d = 10d;
        long l = 55l;

        //System.out.println(i/0);
        //System.out.println(l/0);
        //System.out.println(s/0);
        //System.out.println(b/0);

        //decimal types like float and double gives output infinity when div by 0 whereas integral types like short int long byte gives exception

        
        System.out.println(f/0); //infinity
        System.out.println(d/0); //infinity
    }
}