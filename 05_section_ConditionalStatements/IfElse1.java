import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class IfElse1 {
    public static void main(String args[]){

        int n;
        Scanner sc=new Scanner(System.in);

        //Find grade of student
        int m1,m2,m3;
           
          
           
           System.out.println("Enter marks of 3 Subjects ");
           m1=sc.nextInt();
           m2=sc.nextInt();
           m3=sc.nextInt();
           
           float avg=(float)(m1+m2+m3)/3;
           
           if(avg>=70)
           {
               System.out.println("Grade A");
           }
           else if(avg>=60 && avg<70)
           {
               System.out.println("Grade B");
           }
           else if(avg>=50 && avg<60)
           {
               System.out.println("Grade C");
           }
           else if(avg>=40 && avg<50)
           {
               System.out.println("Grade D");
           }
           else 
           {
               System.out.println("Grade E");
           }

        /* 
        //Checking person is young or old
        System.out.println("Enter the age:");
        n=sc.nextInt();

        if(n>=14 && n=<55)
        {
            System.out.println("Person is Young");
        }
        else if(n>55)     // (n<14 || n>55)
        {
            System.out.println("Person is Old");      
        }
        else
        {
            System.out.println("Too young");
        }
        */
       
       
       /* 
        System.out.println("Enter the number:");
        n=sc.nextInt();
        //Checking no is odd or even
        if(n%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
        */


    }
    
}
