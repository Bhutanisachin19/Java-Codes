

interface first_interface
{
	int inter = 10;
	void inter_disp();
}

class One implements first_interface
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

    public void inter_disp()
    {
        //inter = inter + 10; //error
        System.out.println("Overridding interface method ");
    }
}

class OneMain
{
    public static void main(String[] args)
    {
        One obj = new One();
        obj.disp();
        obj.disp_val();
        obj.inter_disp();
    }
}

