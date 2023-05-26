class Parent
{
    public Parent()
    {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor");
    }
}
class Grandchild extends Child
{
    public Grandchild()
    {
        System.out.println("Grand Child Constructor");
    }
}

public class Inherit_Constructors {
    public static void main(String args[])
    {
        //Child c=new Child();
        //Parent p=new Parent();
        Grandchild gc=new Grandchild();
    }
    
}
