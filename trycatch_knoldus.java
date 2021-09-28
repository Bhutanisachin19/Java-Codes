
class Excep_try
{
    static String check()
    {
        try
        {
            //int val = 10/0;
            return "Try";
        }
        catch(Exception e)
        {
            return "Catch";
        }
        /*
        finally
        {
            return "Finally";
        }
        */

    }

    public static void main(String[] args)
    {   
        String answer = check();

        System.out.println(answer);

    }
}