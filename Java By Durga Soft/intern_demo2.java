class intern_demo2
{
    public static void main(String[] args)
    {
        String s1 = new String("durga");
        String s2 = s1.concat("software"); //concate is a runtime operation hence obj will only be created in heap

        String s3 = s2.intern(); //intern will create obj in scp 
        System.out.println(s2==s3); //false
        String s4 = "durgasoftware";
        System.out.println(s3==s4);//true

        System.out.println("Hello");

    }
}