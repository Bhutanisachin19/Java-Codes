
class Star
{
		public static void main(String[] args)
	{
		int []arr[] = new int[5][4];
		int a=0;
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<4;j++)
				{
					arr[i][j] = a++;
					System.out.print(a);
				}
				System.out.println();
			}
	}
}


class Star2
{
		public static void main(String[] args)
	{
		int []arr[] = new int[5][];

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
					System.out.print("*");
				}
				System.out.println();
			}
	}
}