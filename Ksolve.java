/*

import java.util.Scanner;
import java.util.Arrays; 
import java.util.Collections; 

class Test{
    Scanner obj = new Scanner(System.in);
    int n,k;
    void solve()
    {
        
        System.out.println("Enter the size of array");
        n = obj.nextInt();

        System.out.println("Enter the kth term");
        k = obj.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements oif array");

        for(int i=0;i<n;i++)
            arr[i] = obj.nextInt();


        System.out.println("Array you entered is");

        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
        
        
        Arrays.sort(arr); 
        System.out.println("Array after sorting");

        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");

        int sum = 0;

        for(int i=n-1, j=0 ; j<k ; i-- , j++)
            sum += arr[i];
        
        System.out.println("Sum is "+ sum);

    }

    public static void main(String []args)
    {
        Test t = new Test();
        t.solve();

    }

}
*/



//nth fibonacci number 

/*
import java.util.Scanner;
class Fibo
{
    int n;
    Scanner obj = new Scanner(System.in);

    void input()
    {
        System.out.println("Enter number ");
        n = obj.nextInt();
    }

    int fib(int n)
    {
        double phi = (1+Math.sqrt(5))/2;
        return (int) Math.round(Math.pow(phi,n)/Math.sqrt(5));
    }

    public static void main(String []args)
    {
        Fibo t = new Fibo();
        t.input();
        int num = t.fib(t.n);
        System.out.println(num);
    }
}
*/

//calculate mac occurance if same of 2 return 0

/*
import java.util.Scanner;
class Max_Occurance
{
    Scanner obj = new Scanner(System.in);

    int arr[] = new int[25];
    String s;

    void input()
    {
        System.out.println("Enter a string ");
        s = obj.nextLine();

        System.out.println("Entered string is "+ s);
    }

    int cal_occurance()
    {
        int n;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== ' ')
                continue;
            else
            {
                //System.out.println("char is "+ s.charAt(i));
                n = (int) s.charAt(i);
                //System.out.println("int is "+ n);
                n = n-97; // a = 97 storing a at 1st in array so 97-97 = 0 arr[0]
                arr[n]++;
            }
        }


        int occurance = 0;
        for(int i=0;i<25;i++)
        {
            //System.out.println(arr[i]);
            if(arr[i] > occurance)
                occurance = arr[i];
        }

        
    //if 2 or more has the same occurance i.e highest return 0
        int flag = 0;
        for(int i=0;i<25;i++)
        {
            if(arr[i] == occurance)
                flag++;
        }

        //System.out.println(occurance);

        
        if(flag > 1)
            return 0;
        else
            return occurance;
        
        }

    
    public static void main(String []args)
    {
        Max_Occurance oc = new Max_Occurance();
        oc.input();
        int num = oc.cal_occurance();
        System.out.println(num);
    }
}
*/


