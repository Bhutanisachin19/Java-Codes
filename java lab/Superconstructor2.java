class A
{
	public A()
	{
		System.out.println("A1");
	}
	
	
	public A(int a)
	{
		System.out.println("A1 parametr");
	}
}
class B extends A
{
	public B()
	{
		
		this(4); //calls B's parametr const
		System.out.println("B1");
	}

	public B(int x)
	{
		//super();
		super(10);
		System.out.println("B2");
	}
}

class Example
{
	public static void main(String[] args)
	{
		B obj = new B();
	}
}

