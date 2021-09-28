//implementing interface 1st

class One 
{
	int one; // bydefault 0
	
	void disp()
	{
		System.out.println("Hello from one");
	}
	
	void disp_val()
	{
		System.out.println("Value of one is " +one);
	}
}

interface first_interface
{
	int inter=1019;
	void inter_disp();
}

class Two  extends One implements first_interface 
{
	int two; // bydefault 0
	
	void disp()
	{
		System.out.println("Hello from two");
	}
	
	void disp_val()
	{
		System.out.println("Value of two is" +two);
	}

	public void inter_disp()
	{
		System.out.println("Value of interface int is " +inter);
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Two obj1 = new Two();
		obj1.disp();//shadowing
		obj1.disp_val();//shadowing
		
		//obj1.disp2();
		//obj1.disp_val2();
		
		obj1.inter_disp();
		obj1.inter++; // error because it if final i.e constant
		System.out.println(obj1.inter);
	}
}