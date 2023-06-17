//Generics Example 2

class MyArray<T>
{
    T A[]=(T[]) new Object[10];// We cannot create the Array of type Generic,but we can create an Array of type Object and typecast it as Generic.
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

public class Generics2 {
    public static void main(String args[])
    {
        MyArray<String> ma=new MyArray<>();
        ma.append("Hii");
        ma.append("Hello");
        ma.append("Kya haal");


        //MyArray<Integer> ma=new MyArray<>();
        //ma.append(10);
        //ma.append(20);
        //ma.append(30);

        ma.display();


    }
}
