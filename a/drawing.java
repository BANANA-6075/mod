import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class drawing extends Applet implements MouseMotionListener, MouseListener, ActionListener
{
 int sx,sy,ex,ey;
 TextField t1, t2, t3;
 Color c;
 Button draw, erase;
 int d;

 public void init()
 {
 sx=sy=ex=ey=0;
 t1= new TextField("o",5);
 t2= new TextField("o",5);
 t3= new TextField("o",5);
 add(t1);
 add(t2);
 add(t3);
 c= new Color(0,0,0);
 draw= new Button("DRAW");
 erase= new Button("ERASE");

 add(draw);
 add(erase);
 addMouseMotionListener(this);
 addMouseListener(this); 
 draw.addActionListener(this);
 erase.addActionListener(this);
 d=0;
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==draw)
 d=0;
if(e.getSource()==erase)
 d=1;
}

public void mousePressed(MouseEvent e2)
{
 if(e2.getModifiers()==16)
{
sx=ex=e2.getX();
sy=ey=e2.getY();
}

if(e2.getModifiers()==4)
{
c=new Color(Integer.parseInt(t1.getText()), Integer.parseInt(t2.getText()), Integer.parseInt(t3.getText()));
}
}

public void mouseDragged(MouseEvent e)
{
if(e.getModifiers()==16)
{
 ex=e.getX();
 ey=e.getY();
 repaint();
}
}

public void update(Graphics g)
{
if(d==0)
 {
g.setColor(c);
g.drawLine(sx,sy,ex,ey);
}

if(d==1)
{
g.setColor(getBackground());
g.fillRect(sx,sy,20,20);
}
sx=ex;
sy=ey;
}
public void mouseMoved(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
public void mouseEntered(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
public void mouseClicked(MouseEvent e) {}
}

/*<applet code="drawing.class" height=300 width=300>  </applet> */