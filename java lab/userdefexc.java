//userdef unchecked 
// remove comment to make userdef checked and change runtimexc to exception
import java.util.*; 

class Mail extends RuntimeException
{
	Mail()
	{
		System.out.print("Please enter Correct email ID");
	}
}

class Detail
{
	Scanner obj = new Scanner(System.in);
	String email;
	void enter() throws Mail
	{
		System.out.println("Enter email id");
		email = obj.nextLine();
		//try
	//	{
			if(email.indexOf("@") < 0)
				throw new Mail();
		//}
		/*
		catch(Mail e)
		{
				System.out.println(" ");
				enter();
		}
		*/
	}
	public static void main(String[] args) throws Mail
	{
		Detail input = new Detail();
		input.enter();
		
	}
}