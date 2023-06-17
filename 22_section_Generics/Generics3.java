class MyArray<T>
{
    T A[]=(T[]) new Object[10];
    int length=0;

    public void append(T v)
    {
        A[length++]=v;
    }
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(A[i]);
        }
    }
}

public class Generics3 
{
    static <E> void show(E[] list)   //Generic Method
    {
        for(E x:list)
        {
            System.out.print(x+" ");
        }
    }

    static void fun(MyArray<?> obj)//WildCard <?>--->unbounded wildcard, it means any datatype
    {                              // <? super/extends  datatype>-->Bounded wildcard
        obj.display();
    }
    public static void main(String args[])
    {
        MyArray<String> ma1=new MyArray<>();
        ma1.append("Hii");
        ma1.append("Hyeee");

        MyArray<Integer> ma2=new MyArray<>();
        ma2.append(22);
        ma2.append(121);

        fun(ma1);
        fun(ma2);


        //show(new String[]{"hii","kl","ana","kl"});
        //show(new Integer[]{23,22,21,20});

    }
    
}
