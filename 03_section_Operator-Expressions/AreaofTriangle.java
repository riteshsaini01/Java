import java.util.*;

public class AreaofTriangle {
    public static void main(String[] args) {

        //Formula2
        float side1,side2,side3,area;
        System.out.println("Enter the sides of Triangle-");

        Scanner sc=new Scanner(System.in);
        side1=sc.nextFloat();
        side2=sc.nextFloat();
        side3=sc.nextFloat();

        float s=(side1+side2+side3)/2f;
        float a=(s*(s-side1)*(s-side2)*(s-side3));
        area=(float)Math.sqrt(a);//sqrt gives the result in double so we have typecasted it in float

        System.out.println("Area of Triangle is="+area);



         /*
        //Formula1;
        float base,height,area;

        System.out.println("Enter Base and Height-");
        Scanner sc=new Scanner(System.in);
        base=sc.nextFloat();
        height=sc.nextFloat();

        area=base*height/2;
        System.out.println("Area of Triangle is "+area);*/


        
    }
}
