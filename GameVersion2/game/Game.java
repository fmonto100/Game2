package game;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Game {
	protected JFrame window;
	protected Dimension dim;
	protected GamePanel gamePanel;
	protected Thread gameLoop;
	
	public Game() {
		window = new JFrame("My Game");
		dim = new Dimension(800,600);
		window.setSize(dim);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		gamePanel = new GamePanel(dim);
		window.add(gamePanel);
	}
	
	public void run() {
		gameLoop = new Thread(this.gamePanel);
		window.setVisible(true);
		gameLoop.start();
	}
	
	public static void main(String [] args) {
		Game game = new Game();
		game.run();
	}

}
