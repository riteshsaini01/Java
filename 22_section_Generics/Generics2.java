//Generics Example 2

class MyArray<T,K>//Multiple parameters *
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
class MyArray2 extends MyArray<String,String>
{

}
class MyArray3 <T extends Number>//Applying Bound
{
    T B[]=(T[]) new Object[10];
    int length=0;

    public void append(T u)
    {
        B[length++]=u;
    }
    public void display()
    {
        for(int j=0;j<length;j++)
        {
            System.out.println(B[j]);
        }
    } 

}

public class Generics2 {
    public static void main(String args[])
    {
        
        MyArray<String,Integer> ma=new MyArray<>();//Multiple parameters *
        ma.append("Hii");
        ma.append("Hello");
        ma.append("Kya haal");

        /*
        MyArray3<Double> m=new MyArray3<>();//Applying bounds,which means we can use datatypes referring to numbers only
        m.append(10.20);
        m.append(20.113);
        m.append(30.322);
        */
        

        /* 
        MyArray2 m=new MyArray2();//Parameterized Inheritance
        m.append("Hii");
        m.append(10);
        m.append("Kya haal");
        */

        /*
        //Not giving Generic parameter(datatype as parameter)
        MyArray ma=new MyArray<>();
        ma.append("Hii");
        ma.append(10);
        ma.append("Kya haal");
        */


        //MyArray<Integer> ma=new MyArray<>();
        //ma.append(10);
        //ma.append(20);
        //ma.append(30);

        ma.display();
        //m.display();

    }
}
