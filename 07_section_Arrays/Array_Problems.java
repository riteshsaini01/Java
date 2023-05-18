import java.util.Scanner;

public class Array_Problems {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array:");
        int arr[]=new int[4];
        for(int j=0;j<arr.length;j++)
        {
            arr[j]=sc.nextInt();
        }
//Finding the Largest and Second Largest element
         int max1,max2;
         max1=max2=arr[0];
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]>max1)
             {
                max2=max1;
                 max1=arr[i];
             }
             else if(arr[i]>max2)
             {
                max2=arr[i];
             }
              
         }
         System.out.println("Second Largest number is:"+ max2);



       /* int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Largest number is:"+ max);
        */

/*//Searching an element
        System.out.println("Enter the Element you want to search:");
        int ele,i;
        ele=sc.nextInt();
        for( i=0;i<arr.length;i++)
        {
            if(ele==arr[i])
            {
                System.out.println("Number is Found at Index:"+i);
                System.exit(1);
            }
            System.out.println("Number not found in Array");
        }
*/
            
        



/*/sum of element of array
       int sum=0;
       for(int i=0;i<arr.length;i++)
        {
             sum=sum+arr[i];
        }
        System.out.println(sum);
        */


    }
}
