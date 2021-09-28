class Test
{
public static void main(String[] args)
{
	if(args.length > 0)
	{
		for(String i:args)
			System.out.println(args[i]);
	}
else
	System.out.println("Enter parameters");
}
}