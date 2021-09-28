//using Thread class

class A1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Thread A : "+i);
		}
	}
}

class B1 extends Thread
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
		A1 obj = new A1();
		B1 obj1 = new B1();
		obj.start();
		obj1.start();
	}
}