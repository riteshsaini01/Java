import java.io.*;

public class Random_Access_File {
    public static void main(String args[]) throws Exception
    {
        RandomAccessFile rf=new RandomAccessFile("Test3.txt","rw");

        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('d');
        System.out.println((char)rf.read());
        rf.skipBytes(3);
        System.out.println((char)rf.read());
        rf.seek(3);
        System.out.println((char)rf.read());

        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer()+2);
        System.out.println((char)rf.read());
    }
    
}
