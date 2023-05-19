import java.util.Scanner;


public class Method_Problems {

    static void gcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)m=m-n;
            else n=n-m;
        }
        System.out.println(m);
    }

    static boolean prime(int x)
    {   
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0)
            return false;
         }
         return true;
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int x,y;
        System.out.println("Enter the Two numbers:"); 
        x=sc.nextInt();
        y=sc.nextInt();

        gcd(x,y);


        /*int num;
        System.out.println("Enter the number:");
        num=sc.nextInt();

        System.out.println(prime(num));
        */

    }
}
