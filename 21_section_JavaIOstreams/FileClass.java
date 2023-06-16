import java.io.*;

public class FileClass {
    public static void main(String args[]) throws Exception
    {

        File f=new File("Test.txt");
        f.setReadOnly();
        FileOutputStream fos=new FileOutputStream("Test.txt");

        /*
        File f=new File("D:/VS code/Java/21_section_JavaIOstreams");
        System.out.println(f.isDirectory());

        File[] list=f.listFiles();
        for(File x:list)
        {
            System.out.println(x.getName()+" ");
            //System.out.println(x.getPath());
            System.out.println(x.getAbsolutePath());
            System.out.println(x.getParent());
        }
        */

    }
    
}
