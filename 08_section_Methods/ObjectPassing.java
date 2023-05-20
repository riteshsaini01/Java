public class ObjectPassing {
    
    static void change(int A[],int index,int value)
    {
        A[index]=value;
    }

    static void change1(int X[],int index,int value)
    {
        X[index]=value;
    }

    static void change2(int x,int value)
    {
        x=value;
    }

    public static void main(String[] args)
    {
        int A[]={2,4,6,8,10};

        int x=10;//------->Passing primitives they pass like values "Formal parameters change but not actual parameters" 
        change2(x,20);
        System.out.println(x);

        //change(A,2,20);//-------->Passing object as parameter both actual and formal parameters change  
        //change1(A,2,20);

        //for(int x:A)
        //{
        //    System.out.println(x);
        // }


    } 
}
