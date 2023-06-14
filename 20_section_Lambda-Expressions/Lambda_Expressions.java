 @FunctionalInterface
 interface MyLambda
 {
    public void Display();
 }
 public class Lambda_Expressions
 {
    public static void main(String args[])
    {
        MyLambda m=
        ()->        //Lambda Expression
        {
            System.out.println("Hello World");
        };

        m.Display();
    }
 }