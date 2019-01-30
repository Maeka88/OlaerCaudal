import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.net.URL;


public class Drawing extends JComponent{
	
	public int x = 50;
	public int y = 50;

	public int state = 0;
	public int mirror = 0;

	public BufferedImage image;
	public URL resource = getClass().getResource("0.png");
	public BufferedImage bground;
	public URL bg = getClass().getResource("giphy.gif");


	public Drawing(){
		try{
			image = ImageIO.read(resource);
			bground = ImageIO.read(bg);
		}

		catch(IOException e){
			e.printStackTrace();
		}
	} 

	public void reloadImage(){
		if(state == 0){
			resource = getClass().getResource("0.png");
		}

		else if(state == 1){
			resource = getClass().getResource("1.png");
		}

		else if(state == 2){
			resource = getClass().getResource("2.png");
		}

		else if(state == 3){
			resource = getClass().getResource("3.png");
		}

		else if(state == 4){
			resource = getClass().getResource("4.png");
		}

		else if(state == 5){
			resource = getClass().getResource("5.png");
			state = 0;
		}

		state++;

		try{
			image = ImageIO.read(resource);
		}

		catch(IOException e){
			e.printStackTrace();
		}
	}

	public void mirrorImage(){
		if(state == 0){
			resource = getClass().getResource("l0.png");
		}

		else if(state == 1){
			resource = getClass().getResource("l1.png");
		}

		else if(state == 2){
			resource = getClass().getResource("l2.png");
		}

		else if(state == 3){
			resource = getClass().getResource("l3.png");
		}

		else if(state == 4){
			resource = getClass().getResource("l4.png");
		}

		else if(state == 5){
			resource = getClass().getResource("l5.png");
			state = 0;
		}

		state++;

		try{
			image = ImageIO.read(resource);
		}

		catch(IOException e){
			e.printStackTrace();
		}
	}

	public void chargeImage(){
		if(state == 0){
			resource = getClass().getResource("c1.png");
		}

		else if(state == 1){
			resource = getClass().getResource("q2.png");
		}
		else if(state == 2){
			resource = getClass().getResource("c1.png");
		}
		else if(state == 3){
			resource = getClass().getResource("q2.png");
		}
		else if(state == 4){
			resource = getClass().getResource("c1.png");
		}
		else if(state == 5){
			resource = getClass().getResource("q2.png");
			state = 0;
		}

		state++;


		try{
			image = ImageIO.read(resource);
		}

		catch(IOException e){
			e.printStackTrace();
		}
	}

	public void powerImage(){
		if(state == 0){
			resource = getClass().getResource("c2.png");
		}

		else if(state == 1){
			resource = getClass().getResource("q1.png");
		}
		else if(state == 2){
			resource = getClass().getResource("c2.png");
		}
		else if(state == 3){
			resource = getClass().getResource("q1.png");
		}
		else if(state == 4){
			resource = getClass().getResource("c2.png");
		}
		else if(state == 5){
			resource = getClass().getResource("q1.png");
			state = 0;
		}

		state++;

		try{
			image = ImageIO.read(resource);
		}

		catch(IOException e){
			e.printStackTrace();
		}
	}

	/*public void attackAnimation(){
		Thread thread1 = new Thread(new Runnable(){
			public void run(){
				for(int ctr = 0; ctr < 5; ctr++){
					try{
						if(ctr == 4){
							resource = getClass().getResource("run0.png")
						}
						else{
							resource = getClass().getResource("attack"+ctr+".png");
						}
						try{
							image = ImageIO.read(resource);
						}
						catch(IOException e){
							e.printStackTrace();
						}
						repaint();
						Thread.sleep(100);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				for(int x = 0; x<monsters.length; x++){
					if(monsters[x]!=null){
						if(monsters[x].contact){
							monters[x].life = monster[x].life -10;
						}
					}
				}
			}
		});
		thread1.start();
	}

	public void attack(){
		attackAnimation();
	}*/
	public void moveUp(){
		chargeImage();		
		repaint();
	}
	public void moveDown(){
		powerImage();
		repaint();
	}
	public void moveLeft(){
		x=x -5;
		reloadImage();
		repaint();
	}
	public void moveRight(){
		x=x +5;
		mirrorImage();
		repaint();
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(bground,0,0,this);
		g.drawImage(image,x,300,100,100,this);
		
	}
}
