//creating thread using runnable interface

class MyRunnableDemo implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
        }
    }
}


class RunDemo1 
{
    public static void main(String[] args)
    {
        MyRunnableDemo r = new MyRunnableDemo();

        Thread t = new Thread(r);
        t.start();

        
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
        
    }
}