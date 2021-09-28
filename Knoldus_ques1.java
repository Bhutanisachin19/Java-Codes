class Dog
{
    String name;
    int age;

    Dog(String name , int age)
    {
        this.name = name;
        this.age = age;
    }
}


class Donkey
{
    String name;
    int age;

    Donkey(String name , int age)
    {
        this.name = name;
        this.age = age;
    }

    public static void main(String [] args)
    {
        Dog d1 = new Dog("Tommy" , 4);
        Donkey d2 = new Donkey("Tommy" , 4);

        //System.out.println(d1==d2); // error
        System.out.println(d1.equals(d2)); //false
    }
}