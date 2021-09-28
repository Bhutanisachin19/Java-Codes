

class One
{
	static String[] arr ={"hello java"};
	
	public static void main(String[] args)
	{
		System.out.println("Hello from class One");
	    Two.main(arr);
	}
}

class Two
{
	public static void main(String[] args)
	{
		System.out.println("Hello from class two");
	}
}