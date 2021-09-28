
import java.util.*;

class Calculate
{
    String name1 , name2 ;

    int cal_len(String s)
    {
        int len = s.length();
        
        //System.out.println("Length is " + len);

        return len;
    }

    String rev(String s)
    {
        String temp = ""; //empty string

        for(int i=s.length()-1 ;i>=0;i--)
        {
            temp += s.charAt(i);
        }

        //System.out.println(temp);

        return temp;
    }


    public static void main(String[] args)
    {
        Calculate obj = new Calculate();
        int leng = obj.cal_len("Hello Suraj");

        System.out.println(leng);

        String s = obj.rev("Suraj Betichod");

        System.out.println(s);
    }
}