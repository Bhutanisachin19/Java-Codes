// clone() of Object class does shallow copy by default


class Cat
{
    int j;

    Cat(int j)
    {
        this.j = j;
    }
}


//Cloneable is an marker interface  which gives a class ability to clone object

class Dog implements Cloneable
{
    Cat c;
    int i;

    Dog(Cat c,int i)
    {
        this.c = c;
        this.i = i;
    }

    public Object clone() throws CloneNotSupportedException
    {
        //calling parent (Object) class's clone method
        return super.clone();
    }
}


class ShallowCloning 
{
    public static void main(String [] args) throws CloneNotSupportedException
    {
        Cat c = new Cat(20);
        Dog d1 = new Dog(c,10);

        System.out.println(d1.i + "...." + d1.c.j);

        Dog d2 = (Dog) d1.clone();
        d2.i = 888;
        d2.c.j = 999; // will reflect in main object also i.e shallow cloning

        System.out.println(d1.i + "...." + d1.c.j);
    }
}