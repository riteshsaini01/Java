public class Method {

    static int max(int x,int y){

        if(x>y)
        return x;
        else
        return y;
    }

    static void inc(int x)
    {
        x++;
        System.out.println(x);
    }

    public static void main(String args[]){


    /*//if the method called is not static then
        int a=10,b=15;
        Method m=new Method();----->If the called method is not static we have to create another method inside the main method
        System.out.println(m.max(a,b));
        */



    // Using static method
        int a=10,b=15;
        System.out.println(max(a,b));

    //using the inc method
        int c=10;
        inc(c);
        System.out.println(c);


    }
    
}