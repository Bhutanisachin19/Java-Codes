//filehandling using buffer

//writing

import java.io.*;

class File_Buffer
{
	public static void main(String[] args) throws IOException
	{
		int data;
		String s1;
		BufferedWriter obj = new BufferedWriter(new FileWriter("Buffer_File",true));
		
		obj.write("Viva Barca");
		obj.close();
		
		
		BufferedReader obj1 = new BufferedReader(new FileReader("Buffer_File"));
		
		/*
		while( (data = obj1.read())!= -1)
			System.out.println((char)data);
		*/
		
		while(   (s1 = obj1.readLine())!=null)
			System.out.println(s1);
		
		obj1.close();
	}
}