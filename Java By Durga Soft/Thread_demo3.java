class MyThread extends Thread
{

    //implementing my own start method (wont create a new thread) , and run wont be called

    public void start()
    {   
        super.start();//this will create a thread as it will call the thread class start method
        System.out.println("Start Thread");
    }


    public void run()
    {
        System.out.println("Child Thread");
    }
}


class Thread_demo3
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();

        t.start(); //to start a thread , this method is in thread class
    
        System.out.println("Main Thread");
        
    }
}