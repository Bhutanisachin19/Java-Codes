
class Arr
{
	public static void main(String[] args)
	{
		int a=1;
		int [][]arr = new int[5][];
		
		for(int z=0;z<5;z++)
		{
			arr[z] = new int[z+1];
		}
		
		/*
    	 arr[0] = new int[1];
		 arr[1] = new int[2];
		 arr[2] = new int[3];
		 arr[3] = new int[4];
		 arr[4] = new int[5];
		 */
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					arr[i][j] = a;
					System.out.print(a);
					a++;
				}
				a=1;
				System.out.println("");
			}
	}
}