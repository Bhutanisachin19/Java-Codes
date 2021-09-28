
class Parent
{
	void disp()
	{
		System.out.println("Parent");
	}
}

class Child extends Parent
{
	void disp()
	{
		System.out.println("Child");
	}
}

class Inherit2
{
	public static void main(String[] args)
	{
		Parent obj = new Child();
		obj.disp();
	}
}