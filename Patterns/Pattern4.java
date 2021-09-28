//pyramid withput space and only odd number of starts

import java.util.*;

class Pattern4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Enter the number of rows");
        int row = scan.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int j=row-i;j>0;j--)
            {
                System.out.print(" ");
            }

            
            for(int k=i;k>0;k--)
            {
                System.out.print("*");
            }

            //this pattern starts from 2nd row
            for(int l=2;l<=i;l++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        
        System.out.println();
        System.out.println("Reverse of above pattern");
        System.out.println();

    }
}