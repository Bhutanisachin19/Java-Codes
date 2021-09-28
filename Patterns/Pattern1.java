//right angle triangle and its opposite


import java.util.*;
class Pattern1
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int row = scan.nextInt();


        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print("*");

            System.out.println();
        }


            System.out.println();
            System.out.println("Next Pattern");
            System.out.println();

        //opposite pattern
        for(int i=1; i<=row;i++)
        {
            for(int j=row; j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }



        
            System.out.println();
            System.out.println("Next Pattern Combination of above 2 patterns");
            System.out.println();

                    for(int i=1;i<=row;i++)
                    {
                        for(int j=1;j<=i;j++)
                        System.out.print("*");

                        System.out.println();
                    }


                    for(int i=2; i<=row;i++)
                    {
                        for(int j=row; j>=i;j--)
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

    }
}