abstract class Shape
{
    abstract public double Perimeter();
    abstract public double Area();
}
class Circle extends Shape
{
    double radius;
    public double Perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double Area()
    {
       return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape
{
    double length;
    double breadth;

    public double Perimeter()
    {
       return 2*(length+breadth);

    }
    public double Area()
    {
        return length*breadth;
        
    }
}

public class Problem1 {
    public static void main(String args[])
    {
        Circle c=new Circle();
        c.radius=2.5;

        Shape s1=c;
        System.out.println(s1.Area());

        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=20;

        Shape s2=r;
        System.out.println(s2.Area());


    }
    
}
