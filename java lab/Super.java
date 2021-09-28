class Base
{
	int a;
	public Base()
	{
		System.out.println("Default of base");
	}
	
	public Base(int p)
	{
		a=p;
		System.out.println("Parameter of base");
		System.out.println(a);
		
	}
	
	void basefun()
	{
		System.out.println("Hello from base");
	}
}

class Child extends Base
{
	
	Child()
	{
		//super(10);
        System.out.println("Default of Child");
	}
	
	void basefun()
	{
		System.out.println("Hello from child");
	}
	
	public static void main(String args[])
	{
				//Child obj = new Child();
				Base obj = new Child();
				obj.basefun();
	//			obj.childfun();
	}
}
