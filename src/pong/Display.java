package pong;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.util.List;
import java.util.LinkedList;

public class Display implements Drawlable {
	JFrame window;
	Canvas canvas;
	List<Drawlable> children = new LinkedList<>();


	public Display(String title, int width, int height) {
		window = new JFrame(title);
		canvas = new Canvas();
		window.add(canvas);
		window.setSize(width, height);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	@Override
	public void draw(Graphics g) {
		for (Drawlable child : children)
			child.draw(g);
	}


	public void clear(Graphics g) {
		g.setColor(canvas.getBackground());
		g.fillRect(0,0, canvas.getWidth(), canvas.getHeight());
	}

}
