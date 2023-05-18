import java.util.*;

public class Palindrome {
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=sc.nextInt();

       /* //Palindrome
       int n=num;
        int r=1,rev=0;
        while(num>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println(rev);
        if(rev==num)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    */

      /* //Reverse a Number
        int r=1,rev=0;
        while(num>0)
        {
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        System.out.println(rev);
        */
        
        
    //Armstrong Number
        int n=num;
        int r=0, sum=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum + r*r*r;
            
            
        } 
        System.out.println(sum);
        System.out.println(sum==num);
        if(sum==num)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not a Armstrong Number");
        }
      
        

      /* //Count Digits Of Number
        int count=0;
        while(num>0)
        {
            num=num/10;
            count++;
        }  
        System.out.println(count);
        */
        



       /*//Display Digits of number
        int r;
        while(num>0)
        {
            r=num%10;
            num=num/10;
            
        System.out.println(r);
        }
        */
         
    }
}
