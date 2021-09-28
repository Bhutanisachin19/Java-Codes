//space and then star

import java.util.*;

class Pattern2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int row = scan.nextInt();

        for(int i=1;i<=row;i++)
        {
            //for spaces
            for(int j=row ; j>i ; j--)
            {
                System.out.print(" ");
            }
            
            //for starts
            for(int k = 1;k<=i;k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Reverse of above pattern");
        System.out.println();


        //reverse of above pattern
        for(int i=1;i<=row;i++)
        {
            for(int j=i-1 ;j>0;j--)
            {
                System.out.print(" ");
            }

            for(int k=row;k>=i;k--)
            {
                System.out.print("*");
            }

                System.out.println();
        }


        
        System.out.println();
        System.out.println("Combination of above pattern");
        System.out.println();

    
        for(int i=1;i<=row;i++)
        {
            //for spaces
            for(int j=row ; j>i ; j--)
            {
                System.out.print(" ");
            }
            
            //for starts
            for(int k = 1;k<=i;k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }


        
        //reverse of above pattern
        for(int i=2;i<=row;i++)
        {
            for(int j=i-1 ;j>0;j--)
            {
                System.out.print(" ");
            }

            for(int k=row;k>=i;k--)
            {
                System.out.print("*");
            }

                System.out.println();
        }
        
    }
}