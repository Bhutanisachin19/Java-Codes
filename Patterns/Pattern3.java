
// pyramid , with spaces 

import java.util.*;

class Pattern3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Enter the number of rows");
        int row = scan.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int j=row-i +1;j>0;j--)
            {
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++)
            {
                System.out.print(" *");
            }

            System.out.println();
        
        }



        
        System.out.println();
        System.out.println("Reverse of above pattern");
        System.out.println();



    }
}