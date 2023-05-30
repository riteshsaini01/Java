/*abstract class My
{
    abstract public void show();
}*/
interface My{
    public void show();
}
class Outer{
    public void display()
    {
        My m=new My()
        {
            public void show()
            {
                System.out.println("Hello");
            }
        };
        m.show();

    }
}

public class Local_Inner_class {
    public static void main(String args[])
    {
        Outer o=new Outer();
        o.display();
    }
    
}
