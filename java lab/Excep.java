import java.util.Scanner;

class Excep
{
int x, y,z;
int arr[]= new int[3];
Scanner scan = new Scanner(System.in);

void accept()
{
System.out.print("pl;ease enter integer value for x:");
x= scan.nextInt();
System.out.print("pl;ease enter integer value for y:");
y=scan.nextInt();
}
void res()
{
try
{
z=x/y;
System.out.print("array values" + arr[x]);
}


catch(Exception e)
//catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("exception generated" + e.toString());
accept();
}
catch(ArithmeticException e)
{
System.out.println("divide by zero error, please enter non zero value");
System.out.println("exception generated" + e.toString());
accept();
}



finally
{
System.out.println("clean up operations");
}

}

public static void main(String args[])
{
Excep e = new Excep();
e.accept();
e.res();
}
}






