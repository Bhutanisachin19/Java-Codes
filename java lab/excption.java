import java.util.*;

class Mail extends Exception
{
	Mail()
	{
		System.out.println("Please enter correct email id ");
	}
}

class Detail
{
	Scanner obj = new Scanner(System.in);
	String email;
	
	void enter()
	{
		System.out.println("Enter email id");
		 email = obj.nextLine();
		try
		{
			if(email.indexOf('@')<0)
				throw new Mail();
		}
		catch(Mail e)
		{
				System.out.println(" " +e);
				enter();
		}
	}
	
	public static void main(String[] args)
	{
		Detail input = new Detail();
		input.enter();
		
		
	}
}