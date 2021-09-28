interface Intone
{
	void disp();
}

interface Inttwo
{
	int two=10;
	void disp2();
}


class Onee implements Intone , Inttwo 
{
	public void disp()
	{
		System.out.println("Hello One");
	}
	public void disp2()
	{
		System.out.println("Hello two "+two);
	}
	
	
	public static void main(String[] args)
	{
		Onee ob = new Onee();
		ob.disp();
		ob.disp2();
	}
}