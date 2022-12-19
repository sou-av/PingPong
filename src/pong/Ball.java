package pong;

import java.awt.Graphics;
import java.awt.Color;

public class Ball implements Drawlable, Moveable {
	int radius;
	double x, y;
	Color color=Color.black;

	Ball(int radius) {
		this.radius = radius;
	}

	@Override
	public void setPos(int x, int y) {
		this.x = x - radius / 2;
		this.y = y - radius / 2;
	}

	@Override
	public void move(double x, double y) {
		this.x += x;
		this.y += y;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval((int)x, (int)y, radius, radius);
	}

}

