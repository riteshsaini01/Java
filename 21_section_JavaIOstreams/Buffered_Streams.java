import java.io.*;

public class Buffered_Streams 
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis=new FileInputStream("Test2.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        int x;
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(5);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());

        /*
        FileReader fis=new FileReader("Test2.txt");
        BufferedReader bis=new BufferedReader(fis);
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        System.out.println("String "+bis.readLine());
        
         */

    }
    
}
