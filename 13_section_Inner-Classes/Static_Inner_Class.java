class Outer
{
    int x=10;
    static int y=20;

    static class My
    {
        public void show()
        {
            //System.out.println(x+" "+y);-->we cannot access x as it is not static
            System.out.println(y);
        }
    }
}

public class Static_Inner_Class {
    public static void main(String args[])
    {
        Outer.My m=new Outer.My();
        m.show();
    }
    
}
