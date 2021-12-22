import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class applet1 extends Applet implements KeyListener
{
int x=40,y=40;
Label l;
 public void init()
    {
        addKeyListener(this);
	setFocusable(true);
      requestFocusInWindow();
    }
 
 public void paint(Graphics g)
 {
   g.setColor(Color.pink);
   g.fillOval(x,y,120,150); //head
   g.setColor(Color.black);
   g.drawOval(x+17,y+35,30,20);   //lefteye
   g.drawOval(x+70,y+35,30,20);  //righteye
   g.fillOval(x+28,y+41,15,15);   //pupil(left)
   g.drawLine(x+35,y+45,x+35,y+65);  
   g.fillOval(x+81,y+41,15,15);  //pupil(right)
   g.drawLine(x+90,y+45,x+90,y+65);
   g.drawOval(x+50,y+60,15,25);  //nose
   
   g.fillOval(x+41,y+95,40,25); //mouth
    
   
   
 }
public void keyPressed(KeyEvent k)
    {
        int key = k.getKeyCode();
 
        switch(key)
        {
            
            case KeyEvent.VK_RIGHT:
                x= x+ 10;
                break;
            case KeyEvent.VK_LEFT:
                x= x- 10;
                break;
            case KeyEvent.VK_UP:
                y= y-10;
                break;
             
            case KeyEvent.VK_DOWN:
               y=y+10;
                break;
 
        }
 
        repaint();
    }
public void keyTyped(KeyEvent ke) { }
public void keyReleased(KeyEvent ke) { }

public static void main(String[] args) {
   
      new applet1().show();
}










}