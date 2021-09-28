//to check how fianlly behave when control goes to jvm


class Exc
{
	public static void main(String[] args)
	{
		int[] arr = {4,2,8,6};
		int[] arr1 = {4,0,2,3};
		
		for(int i=0;i<4;i++)
		{
			try
			{
				System.out.println(arr[i] / arr1[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Cannot divide by 0 bro");
			}
			finally
			{
				System.out.println("WTF BRO");
			}
		}
	}
}