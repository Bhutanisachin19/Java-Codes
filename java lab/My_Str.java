//string buffer

import java.util.*;

class My_Str
{
	public static void main(String[] args)
	{
		StringBuffer obj = new StringBuffer("Hello Jims Students");
		
		System.out.println("Capacity is : "+obj.capacity());
		
		obj = new StringBuffer(100);
		System.out.println("Capacity is : "+obj.capacity());
		
		obj = new StringBuffer("Hello Jims Students");
		char ch = obj.charAt(10);
		System.out.println("Character at 10th location is :"+ch );
		
		obj.append(" how are you");
		System.out.println("String afrer appendind is :" +obj);
		
		System.out.println("Characters from 10 to 20 location are :");
		for(int i=10;i<=20;i++)
		{
			System.out.println(obj.charAt(i));
		}
		
		obj.insert(6,"BCA IV ");
		System.out.println(obj);	
		
		obj.replace(13,17,"JIMS");
		System.out.println("String after replacing jims with JIMS is : "+obj);	
		
		String extract = obj.substring(18,25);
		System.out.println("Extracted string is : "+extract);
		System.out.println(obj);
		
		obj.delete(0,5);
		System.out.println("After deleting hello from the string : " +obj);
	}
}