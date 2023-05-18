public class Array {
        public static void main(String args[]){
    
            //Declaring Array in various types
    
            int A[]=new int[10];
    
            int B[]={1,2,3,4,5};
    
            int C[];
            C=new int[10];
    
            int[] D=new int[5];
    
            System.out.println(A.length);
    
            //Accessing elements of array
    
            B[2]=15;
    
            //for loop
            for(int i=0;i<B.length;i++)
            {
                System.out.println(B[i]);
            }
    
            //For-each  loop
            for(int x:B)
            {
                System.out.println(x);
            }
        }
    }