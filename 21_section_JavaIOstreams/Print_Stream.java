import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.*;

class Student {
    int rollno;
    String name;
    String dept;
}

public class Print_Stream {
    public static void main(String[] args) throws Exception {
        //InputStream
        FileInputStream fis=new FileInputStream("Test4.txt");
        BufferedReader br= new BufferedReader(new InputStreamReader(fis));

        Student s=new Student();
        s.rollno=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.dept=br.readLine();

        System.out.println("RollNo:"+s.rollno);
        System.out.println("Name:"+s.name);
        System.out.println("Dept:"+s.dept);



        /*
        //OutputStream
        FileOutputStream fos = new FileOutputStream("Test4.txt");
        PrintStream ps = new PrintStream(fos);

        Student s = new Student();
        s.rollno = 10;
        s.name = "John";
        s.dept = "CSE";

        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();
        */
    }
}
