import java.awt.*;
import java.applet.*;
 
public class Smiley extends Applet{
	
	public void paint(Graphics g){
		
		g.drawString("Keep Smiling!!!", 50, 30);
		g.drawOval(60, 60, 200, 200);
		g.fillOval(90, 120, 50, 20);
		g.fillOval(190, 120, 50, 20);
		g.drawLine(165, 125, 165, 175);
		g.drawArc(110, 130, 95, 95, 0, -180);
	}
}
/*<applet code="Smiley.class" width="300" height="300"></applet>*/