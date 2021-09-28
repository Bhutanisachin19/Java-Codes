interface inter1
{
    void one();
}

interface inter2
{
    void two();
}

interface inter3 extends inter1 , inter2
{
    void three();
}



class Test_Inter implements inter3
{
    public void three()
    {
        System.out.println("hello from three");
    }

    
    public void one()
    {
        System.out.println("hello from one");
    }


    
    public void two()
    {
        System.out.println("hello from two");
    }
    

    public static void main(String[] args)
    {
        Test_Inter obj = new Test_Inter();
        obj.one();
        obj.two();
        obj.three();
    }



}