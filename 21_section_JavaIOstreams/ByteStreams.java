import java.io.*;

public class ByteStreams {
    public static void main(String args[]) throws Exception
    {
        //Char Array Reader
        char c[]={'a','b','c','d','e','f','g','h','i','j'};
        CharArrayReader cr=new CharArrayReader(c);
        int x;
        while((x=cr.read())!=-1)
        {
            System.out.print((char)x);
            
        }
        cr.close();


        /*
        //Byte Array Output Stream
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        byte b[]=bos.toByteArray();
        for(byte x:b)
        System.out.println((char)x);

        bos.close();
        */



        /*
        //Byte Array Input Stream
        byte b[]={'a','b','c','d','e','f','g','h','i','j'};

        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        String str=new String(bis.readAllBytes());
        System.out.println(str);
        System.out.println(bis.markSupported());

        bis.close();

        */

    }
    
}
