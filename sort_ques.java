import java.util.Scanner;
class sort_ques
{
    public static void main(String [] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int len = obj.nextInt();

        int arr[] = new int[len];

        System.out.println("Enter the elements of array");

        for(int i=0;i<len;i++)
        {
            arr[i] = obj.nextInt();
        }

        /*
        System.out.println("Array is");

        for(int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }
        */

        //sorting
        
        int temp = 0;
        for(int i=0;i<len;i=i+2)
        {
            try{
                if(arr[i] > arr[i+1])
                {
                    //swap
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            catch(Exception e)
            {
                //for index out of bound
            }
        }

        System.out.println("Sorted Array is");

        for(int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }

        
    }
}