package pong;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class BarController extends Thread implements KeyListener {
	private Main game;
	double speed1, speed2, defaultSpeed=15;
	
	public BarController(Main game) {
		this.game = game;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				game.bar1.move(0, speed1);
				game.bar2.move(0, speed2);
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			speed1 = -defaultSpeed; 
			break;
		case KeyEvent.VK_S:
			speed1 = defaultSpeed;
			break;
		case KeyEvent.VK_UP:
			speed2 = -defaultSpeed;
			break;
		case KeyEvent.VK_DOWN:
			speed2 = defaultSpeed;
			break;
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
		case KeyEvent.VK_S:
			speed1 = 0;
			break;
		case KeyEvent.VK_UP:
		case KeyEvent.VK_DOWN:
			speed2 = 0;
			break;
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}
}
