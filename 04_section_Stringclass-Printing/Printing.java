import java.util.*;

public class Printing{

    public static void main(String[] args){

        int x=-10,y=20;
        float b=12.55f;
        char c='A';
        String str="Hello";

       // System.out.println(x+y);
       // System.out.print(x-y);------->Difference between println & print
       // System.out.print(x+y);

       // System.out.println(x+y+" SUM");
       // System.out.println("SUM "+x+y);
       // System.out.println("SUM "+(x+y));

       // System.out.printf("Hello \n hii");
       // System.out.printf("%d %f %c",x,b,c);

       // System.out.printf("%1$d %2$d %3$f\n",x,y,b); //---->argument_index
       // System.out.printf("%5d\n",x);        //---->width
       // System.out.printf("%(d",x);   //------>FLag
       // System.out.printf("%+5d",x);
       // System.out.printf("%.2f\n",b); //----->Precision
       // System.out.printf("%.8f",b);

       System.out.format("%20s \n",str);
       System.out.format("%-20s",str);
       


    }

}