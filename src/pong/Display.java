package pong;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Display {
	JFrame window;
	Canvas canvas;

	public Display(String title, int width, int height) {
		window = new JFrame(title);
		canvas = new Canvas();
		window.add(canvas);
		window.setSize(width, height);
		window.setVisible(true);
	}

}
