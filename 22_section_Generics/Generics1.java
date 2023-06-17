//Generics Example 1

class Data<T> 
{
    private T obj;

    public void setData(T v)
    {
        obj=v;
    }
    public T getData()
    {
        return obj;
    }
    
}
public class Generics1
{
    public static void main(String args[])
    {
        Data<Integer> d=new Data<>();
        d.setData(10);

        //Data<String> d=new Data<>();
        //d.setData("hii");

        System.out.println(d.getData());

    }
}
