import java.util.*;

class Plus_Minus
{
    static void plusMinus(int[] arr) {

        double pos_no = 0;
        double neg_no = 0;
        double zeros = 0;
        double leng = arr.length;

        //System.out.println(leng);
        
        for(int i=0;i<leng;i++)
        {
            if(arr[i]==0)
            {
                System.out.println("Zero");
                zeros++;
            }
            else if(arr[i]>0)
            {
                System.out.println("POsitive");
                pos_no++;
            }   
            else
            {
                System.out.println("Negative");
                neg_no++;
            }
        }
        
        
        double pos = (pos_no/leng);
        double neg = (neg_no/leng);
        double zer = (zeros/leng);
        
        
         System.out.format("%.6f", pos);
         System.out.println("");
         System.out.format("%.6f", neg);
         System.out.println("");
         System.out.format("%.6f", zer);
        

    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = obj.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements of array");

        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }

        plusMinus(arr);

    }

}