
//if we dont override run() , run() of thread class is called which has empty implementation hence no output

class MyThread extends Thread
{
}


class Thread_demo2
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        
        t.start(); //to start a thread , this method is in thread class

        //System.out.println("Main Thread");
        
    }
}