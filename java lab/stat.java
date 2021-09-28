class Stat
{
	int a;
	static int s;
	static
	{
		//executed first
			System.out.println("Hello from Static block");
           //a=10; // a is not a static variable hence it cannot be used here
			s=100;

	}
	public static void main(String[] args)
	{
		System.out.println("Hello from Main");
		System.out.println(s);

	}
}