class Base
{
	void disp()
	{
		System.out.println("Hello from base");
	}
}

class Child extends Base
{
	void disp()
	{
		System.out.println("Hello from child");
	}
}

class He
{
	public static void main(String[] args)
	{
		Base obj = new Child();
		obj.disp();
	}
}