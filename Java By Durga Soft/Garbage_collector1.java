
class Test
{
    public static void main(String[] args)
    {
        Test t =new Test();

        t = null; //elegible for garbage collection

        System.gc();// requesting jvm for garbage collector

        System.out.println("End Of main");

        //we dont kow which thread will be executed 1st so output can be diff ie end of maine then finalize or opposite

    }

    public void finalize()
    {
        System.out.println("Finallize method called ");
    }
    
}