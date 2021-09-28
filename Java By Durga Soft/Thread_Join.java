/*
    join()
    if a thread want to wait until completion of some other thread 
*/ 

class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
            try
            {
                Thread.sleep(2000); //2 seconds
            }
            catch(InterruptedException e){}
        }
    }
}


class ThreadJoinDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread t = new MyThread();
        t.start();

        //main calls join on t hence main waits until child thread finishes
        //t.join();


        //main calls join on t hence main waits only for 10 seconds
        t.join(10000);

        for(int i=0;i<10;i++)
        {
            System.out.println("main Thread");
        }
    }
}