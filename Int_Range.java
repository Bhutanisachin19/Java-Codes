
class Int_Range
{
    static void hello(int a)
    {
        System.out.println("Hello from Function ");
    }


    public static void main(String [] args) 
    {
        int a = 2147483647; //max number for int

        //int b = 2147483648; //max number for int +1   complie time error

        hello(a); 
    }
}