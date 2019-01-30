import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class MyAnimation extends JFrame implements KeyListener{

	public Drawing draw;

	public MyAnimation(){
		this.draw = new Drawing();
	}
	
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_UP){
			draw.moveUp();
			System.out.print("Boom");
		}

		else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			draw.moveDown();
			System.out.print("Baam");
		}

		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			draw.moveLeft();
			System.out.print("Biim");
		}

		else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			draw.moveRight();
			System.out.print("Beem");
		}
		/*else if(e.getKeyCode() == KeyEvent.VK_SPACE){
			draw.charge();
		}*/
	}
	public void keyTyped(KeyEvent e){
	
	}

	public void keyReleased(KeyEvent e){
	}

	public static void  main (String args[]){
		//animation
		MyAnimation myFrame = new MyAnimation();
		myFrame.setSize(1000,420);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.add(myFrame.draw);
		myFrame.addKeyListener(myFrame);
	}
}	


	