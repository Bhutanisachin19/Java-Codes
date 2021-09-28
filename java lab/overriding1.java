// return types should be compatable in bace and der class (Rule in java)

//return type compatable

class Base
{
	int show()
	{
		System.out.println("Base");
		return 0;
	}
}


class Child extends Base
{
	long show()
	{
		System.out.println("Child");
		return 1234;
	}
}

class Over_1
{
	public static void main(String[] args)
	{
		Child obj = new Child();
		obj.show();
	}
}