class Cylinder1 {
    public double radius;
    public double height;

    public double lidArea()
    {
        return Math.PI*radius*radius;
    }

    public double totalSurfaceArea()
    {
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }

    public double volume()
    {
        return Math.PI*radius*radius*height;
    }


    
}
public class Cylinder{
    public static void main(String args[])
    {
       Cylinder1 cy=new Cylinder1();

       cy.radius=22.3;
       cy.height=33;

       System.out.println("Lid Area:"+cy.lidArea());
       System.out.println("Total Surface Area:"+cy.totalSurfaceArea());
       System.out.println("Volume:"+cy.volume());
        
    }
}
