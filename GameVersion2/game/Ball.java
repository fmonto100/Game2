package game;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends GameObject {
	protected int size;
	protected Color color;
	
	public Ball () {
		this.size = 0;
		this.color = Color.gray;
	}
	
	public Ball(String id, int x, int y, int speed, int direction, int size, Color color) {
		super(id, x, y, speed, direction);
		this.size = size;
		this.color = color;
	}

	@Override
	public void update() {
		this.x = this.x + this.speed;
		if(x>=600) {
			this.x = 100;
		}
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(this.color);
		g.fillOval(this.x, this.y, this.size, this.size);
		
	}
	
	@Override
	public void show () {
		super.show();
		System.out.printf("Size: %d Color: %s\n", this.size, this.color.toString());
	}

}
