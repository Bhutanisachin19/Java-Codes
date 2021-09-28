import java.util.*;

class Array_list_demo
{
    public static void main(String[] args)
    {
        ArrayList <String> A1 = new ArrayList<>();
        A1.add("Sachin");
        A1.add("Leo");
        A1.add("Messi");
        A1.add("SB");
        //A1.add(10);  //because to generics type Security

        System.out.println(A1);

        System.out.println(A1.get(2));

    }
}