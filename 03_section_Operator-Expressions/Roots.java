import java.util.Scanner;
public class Roots {
    public static void main(String[] args){

        System.out.println("Finding roots of Quadratic Equation");
        int a,b,c,x;
        System.out.println("Enter the values of coefficients of Quadratic(a,b,c)=");
        
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        float r1= (float)(-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        float r2=(float)(-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);

        System.out.println("Roots of the quadratic(R1 and R2)="+ r1 +" "+r2);

    
    }
}
