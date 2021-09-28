import java.io.*;

public class My_Throws
{
String name;
public static void main(String[] args)  {
My_Throws i = new My_Throws();
i.accept();
}

public void accept1()
{
accept();
}


public void accept ()
{
try
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Please enter your name");
name = br.readLine();
System.out.println("Name of Person is:" +name);

}
catch(IOException e)
{
System.out.println("IO exception Generated");
}


}}
