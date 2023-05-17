import java.util.Scanner;

public class Loop_Practice {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        //Factorial of a Number
        int num,fact=1;
        System.out.println("Enter the Number:");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
          fact=fact*i;
        }
        System.out.println("Factorial Of given Number is:"+fact);




       /*//Sum of N numbers
        int n,sum=0;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
             sum=sum+i;
        }
        System.out.println("Sum of n No. is:"+sum);
        */


       /*//Multiplication Table
        int i,j;
        
        System.out.println("Enter the number:");
        i=sc.nextInt();
        System.out.println("Multiplication Table of given No. is:");
        for(j=1;j<11;j++)
        {
           
            System.out.println(i+"*"+j+"="+(i*j));
        }
        */
    }
}
