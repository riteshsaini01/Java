class Rectangle{
    private double length;
    private double breadth;

    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public void setLength(double l)
    {
        length=l;
    }
    public void setBreadth(double b)
    {
        breadth=b;
    }

    public Rectangle() //Non-Parameterized
    {
        length=1;
        breadth=1;
    }
    public Rectangle(double l,double b)  //Parameterized
    {
        setLength(l);
        setBreadth(b);
    }
    public Rectangle(double s)  //Parameterized
    {
        length=breadth=s;
    }
    public double area()
    {
        return length*breadth;
    }
}

public class Constructor {
    public static void main(String args[]){
       // Rectangle r=new Rectangle();   //constructor 1
       //Rectangle r=new Rectangle(10,2);//constructor 2
       Rectangle r=new Rectangle(20);  //constructor 3

        System.out.println("Area="+r.area());


    }
    
}
