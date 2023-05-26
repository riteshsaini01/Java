class Circle
{
    public double radius;

    public double Area()
        {
            return Math.PI*radius*radius;
        }
        public double Perimeter()
        {
            return 2*Math.PI*radius;
        }
        public double Circumference()
        {
            return Perimeter();
        }
 }
class Cylinder extends Circle
{
    public double height;

    public double Volume()
    {
        return Area()*height;
    }
}
public class Inheritance
{
    public static void main(String args[])
    {
        Cylinder c=new Cylinder();
        c.radius=7;
        c.height=10;

        System.out.println("Volume "+c.Volume());
        System.out.println("Area "+c.Area());
    }
}