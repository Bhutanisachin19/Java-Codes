import java.util.*;
class Student
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter name");
		String name = obj.nextLine();
		System.out.println("Enter percentage");
		int percentage = obj.nextInt(); // it takes enter in next line thats why it does not take string
		System.out.println("Enter course");
		String course = obj.nextLine();
  		course = obj.nextLine();
		System.out.println(name);
		System.out.println(percentage);
		System.out.println(course);
	}
}