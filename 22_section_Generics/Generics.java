public class Generics<T>
{
    T data[]=(T[]) new Object[3];
    public static void main(String args[])
    {
        Generics<String> gd =new Generics();

        gd.data[0]="Hii";
        gd.data[1]="bye";
        gd.data[2]=new Integer(10);//Generics helps us knowing Errors during Compile time,as in simple objects array it shows error during run time  

        String str=gd.data[0];


    }
}