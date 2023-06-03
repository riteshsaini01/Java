import java.io.*;
import java.util.*;

public class Try_With_Resources 
{
    static FileInputStream fi;
    static Scanner sc;
    
    static void Divide() throws RuntimeException, FileNotFoundException, IOException
    {
        
        
        try(FileInputStream fi=new FileInputStream("trybyresources.txt");
        Scanner sc=new Scanner(fi) )
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/c);
        }
        
    }
    
    public static void main(String[] args) throws RuntimeException, FileNotFoundException, IOException
    {
        try
        {
        Divide();
        }
        catch(RuntimeException e)
        {
            System.out.println(e);
        }
        
        //int x=sc.nextInt();
        
       // System.out.println(x);
        
    }
    
}