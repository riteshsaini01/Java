class rectangleprivate{

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


    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        if(length==breadth)
        return true;
        else
        return false;
    }

}
public class Rectangel1 {
    public static void main(String args[])
    {
        rectangleprivate rp=new rectangleprivate();
        rp.setLength(10.5);
        rp.setBreadth(5.5);

        
        System.out.println("Area:"+rp.area());
        System.out.println("Perimeter:"+rp.perimeter());
        System.out.println("Is it a Square:"+rp.isSquare());

        System.out.println("Length:"+rp.getLength());
        System.out.println("Breadth:"+rp.getBreadth());
        
        
    }

    }
    

