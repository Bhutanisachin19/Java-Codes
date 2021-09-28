/*
    yield()
    this method causes to pause currently executing thread to give the chance for waiting threads of same priority
*/ 

class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}


class ThreadYieldDemo
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        t.start();

        for(int i=0;i<10;i++)
        {
            System.out.println("main Thread");
        }
    }
}