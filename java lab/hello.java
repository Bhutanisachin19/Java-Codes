import java.util.*;
class Test
{
public static void main(String[] args)
{
System.out.println("HELLO");
Scanner obj = new Scanner(System.in); // .in means keyboard and system is a class
System.out.println("Enter name ,roll no , percentage , course and a random integer");
String name = obj.nextLine();
int no = obj.nextInt();
float per =obj.nextFloat();
String c = obj.nextLine();
int z = obj.nextInt();

System.out.println(name +" " + no +" "+ per +" " + c +" "+z);
//Test2.main();

}
}

class Test2
{
public static void main(String[] args)
{
System.out.println("HELLO from class 2" +args[0]);
}
}