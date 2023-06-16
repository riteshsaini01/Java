import java.io.FileOutputStream;
import java.io.FileInputStream;

public class Problem1 {
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis=new FileInputStream("Source1.txt");
        FileOutputStream fos=new FileOutputStream("Source2.txt");
        
            byte[] b=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            System.out.println(str);

            
            String str1=str.toLowerCase();
            byte[] d=str1.getBytes();
            fos.write(d);

            fis.close();
            fos.close();
            

     }

    }
    
