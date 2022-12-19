package pong;

import java.awt.Graphics;

public class Main {
	Display display = new Display("Ping Pong", 500, 500);
	Ball ball = new Ball(15);
	BallController ballController;

	Main() {
		ballController = new BallController(this);
		display.children.add(ball);
	}

	public static void main(String[] args) {
		Main game = new Main();
		game.ballController.run();
	}

	Graphics getGraphics() {
		return display.canvas.getGraphics();
	}
}
