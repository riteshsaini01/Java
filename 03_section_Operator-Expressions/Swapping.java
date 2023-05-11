//Swapping of two numbers using XOR(^)

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter the two numbers:");
        x=sc.nextInt();
        y=sc.nextInt();

        x=x^y;
        y=x^y;
        x=x^y;
        
        System.out.println("Numbers after swap:");
        System.out.println(x);
        System.out.println(y);
    }
}
