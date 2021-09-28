class Parent
{
    void Paren_disp()
    {
        System.out.println("Parent 1");
    }
    
    void disp()
    {
        System.out.println("parent Disp");
    }
}


class Child extends Parent
{
    void disp()
    {
        System.out.println("Child");
    }

    void child_methd()
    {
        //calls same method
        super.Paren_disp();
        this.Paren_disp();

        //child and parent
        this.disp();
        super.disp();
    }


    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.child_methd();
    }
}

