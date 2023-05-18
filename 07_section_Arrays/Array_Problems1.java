import java.util.Scanner;

public class Array_Problems1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array:");
        int arr[]=new int[4];
        for(int j=0;j<arr.length;j++)
        {
            arr[j]=sc.nextInt();
        }

//Inserting an element
        int A[]=new int[10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
        
        int n=6;
        
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
     
        int x=20;
        int index=2;
        
        for(int i=n;i>index;i--)
            A[i]=A[i-1];
        A[index]=x;
        
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
         
         
/*//left-Right Shifting an Array
        int n=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
            
        }
        arr[arr.length-1]=n;
        System.out.println("");
        for(int x:arr){
            System.out.print(x+"");
            
        }*/




    }
}
