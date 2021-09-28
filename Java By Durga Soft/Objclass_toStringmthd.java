//toString()  internally call hashCode()

/*
class Abc
{
    int i;

    Abc(int i)
    {
        this.i = i;
    }

    public static void main(String[] args)
    {
        Abc obj1 = new Abc(10);
        Abc obj2 = new Abc(20);

        //uses object class toString() which uses hashcode and return classname@hashcode 
        //we cannot predict the hashcode here , we can also override hashCode()
        System.out.println(obj1); // this is equal to  System.out.println(obj1.toString());
        System.out.println(obj1.toString());
        System.out.println(obj2); 

    }
}
*/



//toString()  internally call hashCode() so here toString() of Object class will be executed which wil call hashCode() of our class

//Overriding hashCode()
class Abc2
{
    int i;

    Abc2(int i)
    {
        this.i = i;
    }

    //overriding hashCode()
    public int hashCode()
    {
        return i;
    }

    public static void main(String[] args)
    {
        Abc2 obj = new Abc2(10); // a in hexa
        Abc2 objj = new Abc2(100); // 64 in hexa

        // now we can predict hashcode as we are setting the hashcode 
        System.out.println(obj); // this is equal to  System.out.println(obj1.toString());
        System.out.println(obj.toString());
        System.out.println(objj); 

    }
}