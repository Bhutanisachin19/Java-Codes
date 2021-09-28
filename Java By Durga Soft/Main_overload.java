
class Two_Main
{
    public static void main(String[] args)
    {
        System.out.println("hello from the main main method");
        main(10); //calling other main method
    }

    public static void main(int c)
    {
        System.out.println(" Int Main method called ");
    }
    
}