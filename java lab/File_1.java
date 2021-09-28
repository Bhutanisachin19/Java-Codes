// writing in a file using file i/o stream

import java.io.*;

class Example
{
	public static void main(String[] args) throws IOException
	{
		int i;
		
		FileOutputStream obj = new FileOutputStream("File1",true); //creates a file where code is saved with name File1

		
		String s = "Visca El Barca";
		
		char ch[] = s.toCharArray();
		
		for(i=0;i<s.length();i++)
			obj.write(ch[i]);
		
		obj.close();

		FileInputStream obj1 = new FileInputStream("File1");
		
		do{
			i=obj1.read(); // reads one char at a time
			if(i!=-1)
				System.out.println((char)i);
		}while(i!=-1);
		
		obj1.close();
	}
}