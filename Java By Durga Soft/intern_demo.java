class intern_demo
{
    public static void main(String[] args)
    {
        String s1 = new String("Messi");
        String temp = s1 ; // gets the heap reference 

        System.out.println(s1==temp); //true

        String s2 = s1.intern(); // gives the String Constant Pool obj
        System.out.println(s1==s2); //false

        String s3 = "Messi"; //SCP obj will be given
        System.out.println(s2==s3); //true 

    }
}