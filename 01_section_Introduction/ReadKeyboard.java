import java.lang.*;
import java.util.*;
public class ReadKeyboard {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter two numbers");
        
        x=sc.nextInt();
        y=sc.nextInt();
        z=x+y;
        System.out.println("Sum is:"+z);
    }
}
