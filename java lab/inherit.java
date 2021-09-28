class Base
{
	 Base()
	 {
		 System.out.println("Default Base");
	 }
	 
	 Base(int a)
	 {
		 System.out.println("Parameter Base");
	 }
	 
}
class Child extends Base
{
		
	Child()
	{
		super(10);
		System.out.println("Child Default");
	}
	
}

class Three
{
	public static void main(String[] args)
	{
		Child obj = new Child();
	}
}