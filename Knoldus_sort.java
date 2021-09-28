
import java.util.*;

class Knoldus1
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int len = obj.nextInt();

        int arr[] = new int[len];


        System.out.println("Enter the Elements of array");

        for(int i=0;i<len;i++)
        {
            arr[i] = obj.nextInt();
        }

        System.out.println("The array is");

        
        for(int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);
        
        System.out.println("The SORTED array is");

        for(int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }



        int total = 0;

        System.out.println("The largest numbers of array are ");
        //to get the 4 largest numbers

        for(int i=len-1;i>=len-4;i--)
        {   
            System.out.println(arr[i]);
            total += arr[i];
        }


        System.out.println("Total is " +total);

    }
}