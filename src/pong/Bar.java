package pong;

import java.awt.Graphics;

public class Bar implements Drawlable, Moveable {
	double x, y;
	int width, height;
	
	Bar(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw(Graphics g) {
		g.fillRect((int)x, (int)y, width, height);
	}
	
	@Override
	public void setPos(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void move(double x, double y) {
		this.x += x;
		this.y += y;
	}
}
