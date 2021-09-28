import java.util.Scanner;
class IllegalAge extends Exception
{
IllegalAge()
{
System.out.println("age can not be less than zero or more than 100 ");
}
}

class My_Throw
{

int age;

void accept1()throws IllegalAge
{

accept();
}


void accept() throws IllegalAge
{
Scanner scan = new Scanner(System.in);
System.out.println("Please enter age");
age = scan.nextInt();
//try
//{
if ((age <= 0) || (age >=100)) 
{
throw   new IllegalAge();
}

//}
/*
catch (IllegalAge a)
{
System.out.println("Exception Type:" + a);
accept();
}
*/

}

public static void main(String args[])throws IllegalAge

{
My_Throw t = new My_Throw();
t.accept1();
}
}