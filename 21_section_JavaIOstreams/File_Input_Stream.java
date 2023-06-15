import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class File_Input_Stream {
    public static void main(String args[]) throws Exception
    {
        try( FileInputStream fis =new FileInputStream("Test1.txt"))
        {
            int x;
            while((x=fis.read())!=-1){
        
                System.out.print((char)x);

            }
                 

            /*
            byte b[]=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            System.out.println(str);
            */
            fis.close();

        }
       
    }
    
}
