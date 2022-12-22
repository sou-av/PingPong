package pong;

import java.awt.Graphics;
import java.awt.Color;

public class Ball implements Drawlable, Moveable, Collidable {
	int radius;
	double centerX, centerY;
	Color color=Color.black;

	Ball(int radius) {
		this.radius = radius;
	}

	@Override
	public void setPos(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}

	@Override
	public void move(double dx, double dy) {
		this.centerX += dx;
		this.centerY += dy;
	}

	@Override
	public void draw(Graphics g) {
		final int x = (int)centerX - radius;
		final int y = (int)centerY - radius;
		g.setColor(color);
		g.fillOval(x, y, radius*2, radius*2);
	}

	@Override
	public boolean checkCollisionAt(Integer x, Integer y) {
		int dx = (x != null) ? x - (int)centerX : 0;
		int dy = (y != null) ? y - (int)centerY : 0;
		return Math.hypot(dx, dy) <= this.radius;
	}

}

