import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
} 

class MyFrame extends Frame
{
    TextField tf;
    Button b;
    int count=0;
    
    MyFrame()
    {
        super("Event Demo");
        
        tf=new TextField("0",20);
        b=new Button("Click");
        
        setLayout(new FlowLayout());
        add(tf);
        add(b);

        addWindowListener(new MyWindowAdapter());
        
        b.addActionListener((ActionEvent ae)-> {count++;tf.setText(String.valueOf(count));});
            
            
        
        
    }
        
}

public class Handling_Event
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }    
}