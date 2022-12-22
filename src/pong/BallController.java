package pong;

import java.awt.Graphics;

public class BallController extends Thread {
	private Main game;
	private double theta = 30 * Math.PI / 180;
	private double speed = 15;

	BallController(Main game) {
		this.game = game;
	}

	@Override
	public void run() {
		final int width = game.display.canvas.getWidth();
		final int height = game.display.canvas.getHeight();
		int ballTipX, ballTipY;
		double speedX, speedY;
		Graphics g = game.getGraphics();
		while (true) {
			try {
				speedX = speed * Math.cos(theta);
				speedY = speed * Math.cos(theta);
				ballTipX = (int)(game.ball.centerX + game.ball.radius * Math.cos(theta));
				ballTipY = (int)(game.ball.centerY + game.ball.radius * Math.sin(theta));

				game.display.draw(g);
				game.ball.move(speed * Math.cos(theta), speed * Math.sin(theta));

				if (game.ball.checkCollisionAt(1, null)) {
					theta = Math.PI - theta;
				} else if (game.ball.checkCollisionAt(width, null)) {
					theta = Math.PI - theta;
				}
				
				if (game.ball.checkCollisionAt(null, 1)) {
					theta = -theta;
				} else if (game.ball.checkCollisionAt(null, height)) {
					theta = -theta;
				}

				if (game.bar1.checkCollisionAt(ballTipX, ballTipY)
					|| game.bar2.checkCollisionAt(ballTipX, ballTipY)) {
					theta = Math.PI - theta;
				}
				
				Thread.sleep(100);
				game.display.clear(g);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

