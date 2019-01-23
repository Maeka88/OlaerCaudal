import javax.swing.Jcomponent;
import java.awt.Graphics;
import java.awt.Color;

public class Drawwing extends JComponent{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		g.setColor(Color.PINK);
		g.setfillOval(100,100,50,50);
	}
}