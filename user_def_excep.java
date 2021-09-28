
import java.util.*;

// Runtime to make it unchecked exception
// Exception to make it Checked exception


class Excep extends Exception
{
    Excep()
    {
        System.out.println("Please Enter Correct value");
    }
}


class Demo_user_except
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("please enter a value");

        try
        {
            int a = obj.nextInt();

            if(a < 18)
                throw new Excep();
        }
        catch(Excep e)
        { }
        

    }
}