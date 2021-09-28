class Test
{
    public static void main(String[] args)
    {
        String s1 = new String("Messi");
        String s2 = new String("Messi");

        String s3 = "Messi";
        String s4 = "Messi";

        //comparing references
        System.out.println(s1 == s2); //false
        System.out.println(s1 == s3); //false
        System.out.println(s1 == s4);  //false
        System.out.println(s3 == s4);//true as both gets obj from SCP x


    }
}