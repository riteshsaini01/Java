import java.awt.*;

class MyFrame extends Frame
{
    Label l;
    Text_Field tf;
    Button b;
    
    public MyFrame()
    {
        super("My App");
        
        setLayout(new FlowLayout());
        
        l=new Label("Name");
        tf=new Text_Field(20);
        b=new Button("OK");
        
        add(l);
        add(tf);
        add(b);   
        
    } 
} 
public class AWT_App1
{    
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
} 

