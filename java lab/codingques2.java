//shubham sharma

class Program
{
	public static void main(String[] args)
	{
		String s = "a11472o5t6";
		int arr[] = new int[10];
		int no=0;
		for(int i=0;i<s.length();i++)
		{
			no = (int)s.charAt(i);
			if(no>=48 && no<=57)
			{
				arr[no-48]++;
			}
		}
		
		for(int i:arr)
			System.out.print(i+" ");
	}
}