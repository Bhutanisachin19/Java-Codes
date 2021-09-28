class Thread1 extends Thread
{
	public static void main(String[] args)
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1);
		t1.setName("My Thread");
        t1.setPriority(7);
		System.out.println(t1);
	}
}