interface Test
{
    void meth1();
    void meth2();
}
class Test1 implements Test
{
    public void meth1()
    {
        System.out.println("Meth1 of Test1");
    }
    public void meth2()
    {
        System.out.println("Meth2 of Test1");
    }
    public void meth3()
    {
        System.out.println("Meth3 of Test1");
    }
}
public class Interfaces
{
    public static void main(String args[])
    {
        Test t=new Test1();
        t.meth1();
        t.meth2();
    }
}