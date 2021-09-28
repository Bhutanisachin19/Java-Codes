//using runable interface

class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Thread A : "+i);
		}
	}
}

class B implements Runnable
{
	public void run()
	{
		for(int i=10;i<=15;i++)
		{
			System.out.println("Thread B : "+i);
		}
	}
	
	public static void main(String args[])
	{
		Thread obj1 =  new Thread(new A());
		Thread obj2 =  new Thread(new B());
		obj1.start();
		obj2.start();
	}
}