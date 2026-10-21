package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
	Block block;
	Ball ball;
	
	public GamePanel(Dimension dim) {
		this.setBackground(Color.black);
		this.setSize(dim);
		ball = new Ball("Ball1", 100,100,3,1,50,Color.red);
		block = new Block("Block1", 400,100,5,1,100,Color.blue);
		
	}
	
	public void update () {
		ball.update();
		block.update();
	}
	
	public void render(Graphics g) {
		ball.render(g);
		block.render(g);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.render(g);
		
		Toolkit.getDefaultToolkit().sync();
	}

	@Override
	public void run() {
		while(true) {
			this.update();
			this.repaint();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
