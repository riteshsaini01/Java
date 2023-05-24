// Parameterized constructor

class Parent
{
    Parent()
    {
        System.out.println("Non-Parameterized of Parent");
    }
    Parent(int x)
    {
        System.out.println("Parameterized of Parent");
    }
}
class Child extends Parent
{
    Child()
    {
        System.out.println("Non-Parameteried of Child");
    }
    Child(int y)
    {
        System.out.println("Parameterized of Child");
    }
    Child(int x,int y)
    {
        super(x); // keyword to call the parameterized constructor of parent class
        System.out.println("2 Parameterized of Child");
    }
}

public class Inherit_Constructor1 {
    public static void main(String args[])
    {
        //Child c=new Child();
        //Child c=new Child(20);

        Child c=new Child(10,20);

    }
    
}
