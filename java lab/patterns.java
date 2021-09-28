import java.util.*;
class Pattern
{
	public static void main(String[] args)
	{
		for(int i=0;i<=7;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Palindrome
{
	public static void main(String[] args)
	{
			Scanner obj = new Scanner(System.in);
				System.out.println("Enter a number");
				int num = obj.nextInt();
				int temp = num;
				int rem,pal=0;
				while(num>0)
				{
					rem=num%10;
					pal = (pal*10) + rem;
					num = num/10;
				}	
				//System.out.println(pal);
				if(temp == pal)
					System.out.println("Number is palindrome");
				else
					System.out.println("Number is NOT palindrome");
	}
}

class Table
{
	public static void main(String[] args)
	{	
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = obj1.nextInt();
		int multi;
		for(int i=0;i<=num ;i++)
		{
			multi = i*num;
			System.out.println(i +"*" +num + "=" +multi);
		}
		
	}
}

class Factorial
{
	public static void main(String[] args)
	{
		Scanner obj2 = new Scanner(System.in);
		System.out.println("Enter a number");
		int no =  obj2.nextInt();
		int fact =1;
		for(int i=1;i<=no;i++)
		{
			fact = fact*i; 
		}
		System.out.println("Factorial is "+fact);
	}
}
