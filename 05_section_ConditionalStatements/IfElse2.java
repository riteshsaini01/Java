import java.util.Scanner;

public class IfElse2 {
    public static void main(String args[])
    
    {

        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a Year number");
        int year=scan.nextInt();
        
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                     System.out.println("Its a Leap Year");
                    
                }
                else
                    System.out.println("Not a Leap Year");
                    
                
            }
            else
            {
                  System.out.println("Its a Leap Year");

            }
            
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
         /*
       //Find the Radix of number
        String num;
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextLine();

        if(num.matches("[01]+")){

            System.out.println("Binary Radix=2");
      
        }
        else if(num.matches("[0-7]+"))
            {
                System.out.println("Octal Radix=8");
            }
        else if(num.matches("[0-9A-F]+"))
            {
                System.out.println("Hexa Radix=16");
            }
        else
        {
            System.out.println("Not a Number");
        }
      */


    }
}
