class Product
{
    private String itemno;
    private String name;
    private double price;
    private int quantity;

    public String getItemno()
    {
        return itemno;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(int p)
    {
        price=p;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int q)
    {
        quantity=q;
    }

    public Product(String itemno,String name)
    {
        System.out.println("This Product  "+ itemno +"  belongs to  "+name);

    }

    public Product(String itemno,String name,double price,int quantity)
    {
       
        System.out.println(itemno);
        System.out.println(name);
        System.out.println(price);
        System.out.println(quantity);
    }
}

public class Constructor2 {
    public static void main(String args[]){

        Product p=new Product("AB123","Ritesh");


    }
    
}
