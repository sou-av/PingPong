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
		Graphics g = game.getGraphics();
		while (true) {
			try {
				game.display.draw(g);
				game.ball.move(speed * Math.cos(theta), speed * Math.sin(theta));

				if (game.ball.x <= 1) {
					theta = Math.PI - theta;
				} else if (game.ball.x >= game.display.canvas.getWidth()) {
					theta = Math.PI - theta;
				}
				
				if (game.ball.y <= 1) {
					theta = -theta;
				} else if (game.ball.y >= game.display.canvas.getHeight()) {
					theta = -theta;
				}
				
				Thread.sleep(100);
				game.display.clear(g);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

