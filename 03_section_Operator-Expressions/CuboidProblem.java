import java.util.Scanner;
public class CuboidProblem {
    public static void main(String[] args){

     Scanner sc=new Scanner(System.in);
     int length,breadth,height;
     int totalArea,volume;

     System.out.println("Enter the Length,Breadth and Height=");
     length=sc.nextInt();
     breadth=sc.nextInt();
     height=sc.nextInt();

     totalArea=2*(length*breadth+length*height+breadth*height);

     volume=length*breadth*height;

     System.out.println("Total Area= "+totalArea);
     System.out.println("Volume= "+volume);



    }
}
