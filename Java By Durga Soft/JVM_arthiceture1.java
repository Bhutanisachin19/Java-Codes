class Student
{
    public static void  hello()
    {
        System.out.println("Hello Students");
    }
}


class JVM_arc1
{
    public static void main(String[] args) throws Exception
    {
        Student s1 = new Student();
        Class c1 = s1.getClass();

        
        Student s2 = new Student();
        Class c2 = s2.getClass();

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1 == c2);


    }
}