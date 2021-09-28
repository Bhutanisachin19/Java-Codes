
/*
    input 1 Sachin Leo Cr7
    input 2 Sachin Cr7

    output Leo
*/

import java.util.*;

class Rice
{
    static String s1,s2,s3;
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        s1 = obj.nextLine();
        s2 = obj.nextLine();
        
        //String s3 = " ";
        
        String[] splited1 = s1.split(" ");
        String[] splited2 = s2.split(" ");

        System.out.println("1st array is ");
        
        for(int i=0;i<splited1.length;i++)
            System.out.println(splited1[i]);

        
        System.out.println("2nd array is ");
        
        for(int i=0;i<splited2.length;i++)
            System.out.println(splited2[i]);
        

        int num;
        for(int i=0;i<splited1.length;i++)
        {
            num=0;

            for(int j=0;j<splited2.length;j++)
            {
                if(splited1[i].equals(splited2[j]))
                {
                    System.out.println("Arr1 " +splited1[i]);
                    System.out.println("Arr2 " +splited2[j]);
                    num = num + 1;
                }
            }
                if(num==0)
                {
                    s3 = splited1[i];
                    break;
                }
        }

        System.out.println("Missing word is "+ s3);
    }
}