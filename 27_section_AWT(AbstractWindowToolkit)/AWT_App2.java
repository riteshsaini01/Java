import java.awt.*;

public class AWT_App2
{
    static  int count=0;

    public static void main(String[] args) 
    {
        Frame f=new Frame();
        f.setTitle("My First Window App");
        Button b=new Button("Click Me");
        f.add(b);
        Text_Field tf=new Text_Field(20);
        f.add(tf);
        
        b.addActionListener((e)->tf.setText("Clicked "+count++));
        
        f.setLayout(new FlowLayout());
        f.setSize(500,500);
        f.setVisible(true);
        
    }
    
}