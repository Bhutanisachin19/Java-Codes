
//return all the triplets with sum 0 in a new array

import java.util.*;

class triplets
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size of array ");
        int n = obj.nextInt();


        int arr[] = new int[n];

        System.out.println("Enter the elements of array ");
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }


        System.out.println("Elements of array ");

        
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }


        int res[] = new int[100];
        int index = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if( arr[i] + arr[j] + arr[k] == 0)
                    {
                        
                        res[index] = arr[i];
                        index++;
                        
                        res[index] = arr[j];
                        index++;
                        
                        res[index] = arr[k];
                        index++;
                    }
                }
            }
        }

        System.out.println("Triplets are ");

        for(int i=0;i<index;i++)
        {
            System.out.println(res[i]);
        } 

    }
}