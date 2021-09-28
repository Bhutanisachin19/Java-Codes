class Test
{
public static void main(String[] args)
{
	if(args.length > 0)
	{
		System.out.println("Entered string is");
		for(String s : args)
			System.out.println(s);
	}
    else
	System.out.println("Please Enter a String");
    }
}