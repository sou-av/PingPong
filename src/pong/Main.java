package pong;

import java.awt.Graphics;

public class Main {
	Display display = new Display("Ping Pong", 500, 500);
	Ball ball = new Ball(15);
	BallController ballController;
	BarController barController;
	Bar bar1 = new Bar(20, 80);
	Bar bar2 = new Bar(20, 80);

	Main() {
		bar1.setPos(20, 250);
		bar2.setPos(450, 250);
		ballController = new BallController(this);
		barController = new BarController(this);
		
		display.canvas.addKeyListener(barController);		
		
		display.children.add(ball);
		display.children.add(bar1);
		display.children.add(bar2);
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
