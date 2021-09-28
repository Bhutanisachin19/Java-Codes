
import java.util.Scanner ;

class Solution
{
    public static void main(String[] args)
    {   
        Scanner obj = new Scanner(System.in);
        int t , n , m , s ;

           //test cases
            t = obj.nextInt();


        for(int i=0;i<t;i++)
        {    
            //number of prisoners
            n = obj.nextInt();

            //number of sweets
            m = obj.nextInt();

            //the chair number to start passing out treats at
            s = obj.nextInt();

            int diff = 0;
            int sub = 0;
            int pos = 0;
            
            if(n < m)
            {
                System.out.println("More Candy");
                for(int j=1;j<=10;j++)
                {
                    if(n*j > m)
                        {
                            diff = (n*j) - m ;
                            /*
                            System.out.println(n); 
                            System.out.println(j);   
                            System.out.println(diff);  
                            */ 
                            break;
                        }
                }

                sub = n - diff;
                //System.out.println(sub);  

                s = s-1;
                //System.out.println(s); //should be +ve

                sub = sub + s ;
                //System.out.println("Final answer "+ sub);
                System.out.println(sub);
            }
            else
            {
                //if candy less than prisoners
                int sub2 =  m + s -1;
                System.out.println(sub2);
            }
        }


    }
}