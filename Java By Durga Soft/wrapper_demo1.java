class  wrapper_demo1
{
    public static void main(String[] args)
    {
        //Boolean wrapper class

        Boolean B1 = new Boolean("yes"); //treated as false
        Boolean B2 = new Boolean("no");   //treated as false
        System.out.println(B1);
        System.out.println(B2);

        System.out.println(B1.equals(B2));




        Boolean B3 = new Boolean("True"); //treated as true
        Boolean B4 = new Boolean("true"); //treated as true
        Boolean B5 = new Boolean("TRUE"); //treated as true
        Boolean B6 = new Boolean(true); //treated as true
        //Boolean B5 = new Boolean(messi);  //Compile Time Error

        System.out.println(B3);
        System.out.println(B4);
        System.out.println(B5);




    }
}