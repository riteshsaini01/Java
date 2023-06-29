import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener 
{
    int count=0;
    Label l;
    Button b;
    
    public MyFrame()
    {
        super("Button Demo");
        
        l=new Label("    "+count);
        b=new Button("Click");
        b.addActionListener((java.awt.event.ActionListener) this);
        
        
        setLayout(new FlowLayout());
        add(l);
        add(b);
        
        
    }

    public void actionPerformed(ActionEvent e) 
    {
        count++;
        l.setText("  "+count);
    }
}


public class Action_Listener
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
        
        
    }
}