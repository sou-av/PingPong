package pong;

import java.awt.Graphics;

public class Main {
	Display display = new Display("Ping Pong", 500, 500);
	Ball ball = new Ball(15);
	Bar bar1 = new Bar(20, 80);
	Bar bar2 = new Bar(20, 80);
	BallController ballController;
	BarController barController;
	Score score;

	Main() {
		bar1.setPos(15, 250);
		bar2.setPos(450, 250);
		
		ballController = new BallController(this);
		barController = new BarController(this);
		score = new Score(this);
		
		display.window.addKeyListener(barController);		
		
		display.children.add(ball);
		display.children.add(bar1);
		display.children.add(bar2);
		display.children.add(score);
	}

	public static void main(String[] args) {
		Main game = new Main();
		game.barController.start();
		game.ballController.run();
	}

	Graphics getGraphics() {
		return display.canvas.getGraphics();
	}
}
