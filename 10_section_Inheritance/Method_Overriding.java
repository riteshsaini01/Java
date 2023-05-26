class Super
{
    public void display()
    {
        System.out.println("Super Display");
    }
}

class Sub extends Super
{
    public void display()
    {
        System.out.println("Sub Display");
    }
}

public class Method_Overriding
{
    public static void main(String[] args) 
    {
        Super s=new Sub();
        s.display();
          
    }    
}