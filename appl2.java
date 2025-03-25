import java.applet.*;
import java.awt.*;

/*<applet code="appl2.class"width="300"height="300"></applet>*/
public class appl2 extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.MAGENTA);
int x[]={200,300,300,200,100,100};
int y[]={0,100,500,700,500,100};
g.fillPolygon(x,y,6);
g.drawArc(10,20,30,40,50,60);		
}
}
