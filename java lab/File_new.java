import java.io.*;
class File_new
{
	//throws IOException because createNewFile is an checked exception
	public static void main(String []args) throws  IOException
	{
		File obj = new File("Demo_File");
		obj.createNewFile();
		System.out.println(obj.exists());
		System.out.println(obj.canWrite());
		System.out.println(obj.getName());
		System.out.println(obj.length());
		obj.delete();

	}
}