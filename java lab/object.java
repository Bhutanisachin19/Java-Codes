
import java.util.Scanner;
class Student{
Scanner scan = new Scanner(System.in);
int roll;
String name;

void show()
{
System.out.println(roll);
System.out.println(name);
}

void get(){
System.out.println("Enter Name and roll no");
  name = scan.nextLine();
  roll = scan.nextInt();
}



public static void main (String arg[])
{  Student A = new Student();
   Student B = new Student();
  
   A.get();
   B.get();
   A.show();
   B.show();
   System.out.println(B instanceof Student);
}
}



