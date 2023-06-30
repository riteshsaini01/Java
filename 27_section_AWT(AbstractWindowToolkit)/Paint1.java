import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
    int x=0,y=0;
    
    MyFrame()
    {
        super("Painting");
     
        addMouseMotionListener(new MouseAdapter(){
            public void mouseMoved(MouseEvent me)
            {
                x=me.getX();
                y=me.getY();
                repaint();
            }
        });
    }
    
    public void paint(Graphics g)
    {
        g.drawOval(x, y, 50, 50);
    }
    
}

public class Paint1
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }    
}