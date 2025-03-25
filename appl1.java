import java.applet.*;
import java.awt.*;

/*<applet code="appl1.class"width="300"height="300"></applet>*/
public class appl1 extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.BLUE);
g.drawString("Hello World!",100,150);
g.drawLine(150,300,250,300);
g.drawLine(175,350,175,550);
g.setColor(Color.YELLOW);
g.fillOval(200,400,100,150);
g.setColor(Color.MAGENTA);
g.fillOval(300,350,200,200);
}
}
