//userdef unchecked 
//if name is sachin successfull else invalid
import java.util.*; 

class Input extends RuntimeException
{
	Input()
	{
		System.out.println("Invalid Input");
	}
}

class Details
{
	Scanner obj = new Scanner(System.in);
	String name;
	String s = "Sachin";
	void enter()
	{
		System.out.println("Enter Name");
		name = obj.nextLine();
	try
		{
			if(name.equalsIgnoreCase(s))  // or use equals
				System.out.println("Successfull");
			else
				throw new Input();
		}
		catch(Input e)
		{
				System.out.println(" ");
				enter();
		}
	}
	public static void main(String[] args)
	{
		Details input = new Details();
		input.enter();
		
	}
}