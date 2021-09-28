//situation similat to deadlock

/*
    join()
    if a thread want to wait until completion of some other thread 
*/ 

class MyThread extends Thread
{
    static Thread mt;

    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");

            try
            {
                Thread.sleep(2000); //2 seconds

                mt.join(); //waiting for mt i.e main thread to finish which is waiting for this thread to finish

            }
            catch(InterruptedException e){}
        }
    }
}


class ThreadJoinDemo_DL
{
    public static void main(String[] args) throws InterruptedException
    {

        MyThread.mt = Thread.currentThread(); //main thread is stored in mt

        MyThread t = new MyThread();
        t.start();

        //main calls join on t hence main waits until child thread finishes
        t.join();
        
        for(int i=0;i<10;i++)
        {
            System.out.println("main Thread");
        }
    }
}