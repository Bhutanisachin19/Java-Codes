
//string is a immutable class , all immutable classes are final

//here we are creating our own immutable class

public final class Immutable
{
    private int i;

    Immutable(int i)
    {
        this.i = i;
    }

    public Immutable modify(int i)
    {
        if(this.i==i)
        {
            //no change , so return the current object
            return this;
        }
        else
        {
            //if change is there create a new Object with all the changes
            System.out.println("Creating a new Object");
            return (new Immutable(i));

        }
    }


    public static void main(String[] args)
    {
        Immutable obj1 = new Immutable(10);
        Immutable obj2 = obj1.modify(100); //new obj will be created
        Immutable obj3 = obj1.modify(10); //new object wont be created

        System.out.println(obj1 == obj2); //false
        System.out.println(obj1 == obj3); //true 

    }

}