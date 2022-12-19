package pong;

import java.awt.Graphics;

public class Main {
	Display display = new Display("Ping Pong", 500, 500);

	Main() {
	}

	public static void main(String[] args) {
		Main game = new Main();
		Graphics context = game.getGraphics();
	}

	private Graphics getGraphics() {
		return display.canvas.getGraphics();
	}

}
