package game;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Game {
	protected JFrame window;
	Dimension dim;
	GamePanel gamePanel;
	Thread gameLoop;
	
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
		window.setVisible(true);
		gameLoop = new Thread(this.gamePanel);
		gameLoop.start();
	}
	
	public static void main(String [] args) {
		Game game = new Game();
		game.run();
	}

}
