abstract class abs1
{
	int a;
	void dis()
	{
		System.out.println("Value of abstract one a is "+a);
	}
	abstract void hell();
}

abstract class abs2 extends abs1
{
	abstract void hell2();
}

class Hello extends abs2
{
	void hell()
	{
		System.out.println("HEllo 1");
	}
	
	void hell2()
	{
		System.out.println("HEllo 2");
	}
	
	public static void main(String[] args)
	{
		abs2 ob = new Hello();//reference of abs2
		ob.dis();
		ob.hell2();
		
		/*
		Hello ob = new Hello();
		ob.dis();
		ob.hell();
		ob.hell2();
		*/
		
	}
}

