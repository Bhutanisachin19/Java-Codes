//nested class

class Outer
{
	int a=10;
	void hello_out()
	{
		System.out.println("Hello From Outer Class");
	}	
	
	 class Nested
	{
		int n =19;
		public void hello_nested()
		{
			System.out.println("Hello From Inner Class  " +a);
			hello_out();
		}
	}
}

 class Nest
 {
	 public static void main(String[] args)
	 {
		 Outer obj = new Outer();
		// obj.hello_out();
		 // obj.hello_nested(); //cannot be accessed
		 
		 Outer.Nested ob = obj.new Nested();
		 ob.hello_nested();
	 }
 }