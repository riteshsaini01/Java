import java.util.Scanner;

class IfElse{

    public static void main(String args[]){

        //To find Greatest of three nos.-->

       int a,b,c;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter three nos:");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();

       if(a>b && a>c)
       {
        System.out.println("Greatest no is-->"+a);
       }
       else if(b>c)
       {
        System.out.println("Greatest no is-->"+b);
       }
       else 
       {
        System.out.println("Greatest no is-->"+c);
       }




       /*
       
       //To find no. is postive or negative
       
       int n=5;

        if(n>=0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }*/
    }
}