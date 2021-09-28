//immutable class
/*
Immutable class means that once an object is created, we cannot change its content. 
In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable.
 We can create our own immutable class as well.
 */


import java.util.*;

final class One
{
	int a;
	String name;
	Scanner obj = new Scanner(System.in);
	
	void get()
	{
		System.out.println("Enter name and int value");
		 
		a =obj.nextInt();
		name=obj.nextLine();
		name=obj.nextLine();
	}
	void disp()
	{
		System.out.println(name);
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		One o = new One();
		o.get();
		o.disp();
	}
}