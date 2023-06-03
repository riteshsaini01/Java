public class Finally
{
    static void meth1()throws RuntimeException
    {
        try
        {
            
        throw new RuntimeException();
        }
        finally
        {
           //this message willdefinitly execute 
        System.out.println("Final Message");
        }
        
    }
    
    public static void main(String[] args) throws RuntimeException
    {
        meth1();
    }   
}