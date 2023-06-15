import java.io.FileOutputStream;
import java.io.FileInputStream;

public class Problem1 {
    public static void main(String args[]) throws Exception
    {
        try(FileInputStream fis=new FileInputStream("Source1.txt"))
        {
            byte[] b=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            System.out.println(str);
        }
        try(FileOutputStream fos=new FileOutputStream("Source2.txt"))
        {
            String str1=str;
            byte[] d=str1.getBytes();
            fos.write(d);

        }

    }
    
}
